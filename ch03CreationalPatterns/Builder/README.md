## 生成器（Builder）

### 示例一：以不同方式生成列表

- [文本](src/main/java/com/jueee/example01/TextBuilder.java)
- [Html](src/main/java/com/jueee/example01/HtmlBuilder.java)
- [Markdown](src/main/java/com/jueee/example01/MarkDownBuilder.java)
- [测试入口](src/main/java/com/jueee/example01/ExampleMain.java)

### 示例二：模拟电脑的生产或者组装

经典Buider模式中有四个角色：

1. 要建造的产品Product -- 组装的电脑 [Computer.java](src/main/java/com/jueee/example02/Computer.java)
2. 抽象的Builder -- 装CPU、内存条、硬盘等抽象的步骤 [ComputerConfigBuilder.java](src/main/java/com/jueee/example02/ComputerConfigBuilder.java)
3. Builder的具体实现ConcreteBuilder -- 对上述抽象步骤的实现，比如装i5CPU、8G内存条、1T硬盘
   - 低配版的套餐：[LowConfigBuilder.java](src/main/java/com/jueee/example02/LowConfigBuilder.java)
   - 高配版的套餐：[HighConfigBuider.java](src/main/java/com/jueee/example02/HighConfigBuider.java)
4. 使用者Director -- 电脑装机人员 [Director.java](src/main/java/com/jueee/example02/Director.java)
5. 测试入口 [ExampleMain.java](src/main/java/com/jueee/example02/ExampleMain.java)





