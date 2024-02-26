class A extends Thread
{
	public void run()
	{
		System.out.println("ram");
	}
}
class Demo20
{
	public static void main(String ar[])
	{
		A a=new A();
		a.setDaemon(true);
		a.start();
	}
}