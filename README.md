##  设计模式

### 项目说明

本项目是《设计模式：可复用面向对象软件的基础》的学习笔记。

原书采用了 C++ 或 Smalltalk 语言进行代码示例，本项目统一采用 Java。

### 目录

#### ch01.[引言](ch01Introduction)

1.	[什么是设计模式](ch01Introduction/1.1什么是设计模式.md)
2.	[MVC中的设计模式](ch01Introduction/1.2MVC中的设计模式.md)
3.	[描述设计模式](ch01Introduction/1.3描述设计模式.md)
4.	[设计模式的分类](ch01Introduction/1.4设计模式的分类.md)
5.	[设计模式的组织分类](ch01Introduction/1.5设计模式的组织分类.md)
6.	[设计模式解决设计问题的方式](ch01Introduction/1.6设计模式解决设计问题的方式.md)
7.	[怎样选择设计模式](ch01Introduction/1.7怎样选择设计模式.md)
8.	[怎样使用设计模式](ch01Introduction/1.8怎样使用设计模式.md)
9.	[相关词汇表](ch01Introduction/1.9相关词汇表.md)

#### ch02.[实例研究：设计一个文档编辑器](ch02CaseStudy)

#### ch03.[创建型模式](ch03CreationalPatterns)

创建型模式抽象了实例化过程。它们帮助一个系统独立于如何创建、组合和表示它的那
些对象。

一个类创建型模式使用继承改变被实例化的类，而一个对象创建型模式将实例化委托给另一个对象。

1.	[抽象工厂（AbstractFactory）](ch03CreationalPatterns/3.1抽象工厂（AbstractFactory）.md)
2.	[生成器（Builder）](ch03CreationalPatterns/3.2生成器（Builder）.md)
3.	[工厂方法（FactoryMethod）](ch03CreationalPatterns/3.3工厂方法（FactoryMethod）.md)
4.	[原型模式（Prototype）](ch03CreationalPatterns/3.4原型模式（Prototype）.md)
5.	[单例模式（Singleton）](ch03CreationalPatterns/3.5单例模式（Singleton）.md)
6.	[创建型模式的讨论](ch03CreationalPatterns/3.6创建型模式的讨论.md)

#### ch04.[结构型模式](ch04StructuralPatterns)

结构型模式涉及到如何组合类和对象以获得更大的结构。

结构型对象模式不是对接口和实现进行组合，而是描述了如何对一些对象进行组合，从而实现新功能的一些方法。

因为可以在运行时刻改变对象组合关系，所以对象组合方式具有更大的灵活性，而这种机制用静态类组合是不可能实现的。

