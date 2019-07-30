## 抽象工厂（Abstract Factory）

### 示例一：制作HTML文件

将带有层次关系的链接集合制作成HTML文件：

- [部件零件类](src/main/java/com/jueee/example01/item)
- [具体的零件实现](src/main/java/com/jueee/example01/list)
- [配置零件工厂](src/main/java/com/jueee/example01/factory)
- [测试程序](src/main/java/com/jueee/example01/ExampleMain.java)

### 示例二：生产一台计算机

假设我们要生产一台计算机（广义的），一台计算机有一些共同的物件。小型计算机（以手机为例）需要有触控屏、微处理器和小型化的内存条。大型计算机（以PC机为例）需要有显示屏、多核处理器和内存条。计算机的各个部件存在着相互依赖关系。

- [部件接口](src/main/java/com/jueee/example02/item)
- [手机部件](src/main/java/com/jueee/example02/phone)
- [电脑部件](src/main/java/com/jueee/example02/computer)
- [电子产品生产工厂](src/main/java/com/jueee/example02/factory)
- [测试程序](src/main/java/com/jueee/example02/ExampleMain.java)

