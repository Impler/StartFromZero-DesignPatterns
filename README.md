# StartFromZero-DesignPatterns
## 代理模式
	代理模式是通过代理类完成预处理消息、过滤消息、把消息转发给被代理类以及事后处理消息等工作。
	根据代理创建的时期，可以分为静态代理和动态代理。
### 静态代理
	- 特点：
		在程序执行前，.class文件就已生成出来。
	- 缺点：
		每个代理类只能为一个接口服务，如果新增接口方法，还需要新增相应的代理方法，造成代码冗余。
### 动态代理
	- 特点：
		在程序运行时动态生成.class文件
		
	