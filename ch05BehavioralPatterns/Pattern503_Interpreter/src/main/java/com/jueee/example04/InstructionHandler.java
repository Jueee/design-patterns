package com.jueee.example04;

import java.util.Stack;

public class InstructionHandler {
    private AbstractNode node;

    public void Handle(String instruction) {
        // 用栈来保存语法树。
        AbstractNode left = null, right = null;
        AbstractNode direction = null, action = null, distance = null;
        Stack<AbstractNode> stack = new Stack<AbstractNode>();

        // 用空格分隔指令

        String[] word = instruction.split(" ");
        // 循环
        for (int i = 0; i < word.length; i++) {
            if (word[i].equalsIgnoreCase("and")) {
                left = (AbstractNode)stack.pop();
                String wordl = word[++i];
                direction = new DirectionNode(wordl);
                String word2 = word[++i];
                action = new ActionNode(word2);
                String word3 = word[++i];
                distance = new DistanceNode(word3);
                right = new SentenceNode(direction, action, distance);
                stack.push(new AndNode(left, right));
            } else {
                String word1 = word[i];
                direction = new DirectionNode(word1);
                String word2 = word[++i];
                action = new ActionNode(word2);
                String word3 = word[++i];
                distance = new DistanceNode(word3);
                left = new SentenceNode(direction, action, distance);
                stack.push(left);
            }
        }
        this.node = (AbstractNode)stack.pop();

    }

    public String output() {
        String result = node.interpret();
        return result;
    }
}
