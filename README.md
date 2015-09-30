# StartFromZero-DesignPatterns
## 代理模式
	代理模式是通过代理类完成预处理消息、过滤消息、把消息转发给被代理类以及事后处理消息等工作。
	根据代理创建的时期，可以分为静态代理和动态代理。
### 静态代理
	- 特点：
		在程序执行前，代理类字节码文件就已生成出来。
	- 缺点：
		每个代理类只能为一个接口服务，如果新增接口方法，还需要新增相应的代理方法，造成代码冗余。
### 动态代理
	- 特点：
		在程序运行时动态生成代理类字节码，无需编写源代码
	- JDK和CGLIB(Code Generation Library)
		JDK和CGLIB都为实现动态代理提供了解决方案，但其原理不尽相同。
		- JDK只能为实现接口的类做代理，且只能代理接口方法。
			创建代理对象，JDK将会做以下工作：
				1. 获取被代理对象上的所有接口列表
				2. 确定要生成的代理类的类名，默认为：com.sun.proxy.$ProxyXXX
				3. 动态创建代理类的字节码
				4. 将字节码转换为class对象
				5. 创建InvocationHandler实例handler，实现invoke方法，用来处理代理类所有方法调用
				6. 将handler作为代理类入参，创建代理类对象
		- CGLIB基于继承机制，通过继承被代理类，重写方法实现代理。由于受限于继承机制，不能为被final修饰的类或方法代理
			创建代理对象，CGLIB将会做以下工作：
				1. 获取所有被代理类非final的public方法
				2. 将这些方法转换成字节码
				3. 将字节码转换成相应的代理的class对象
				4. 创建MethodInterceptor实例，实现intercept方法，用来处理代理类的方法调用
			
	