class Demo
{
public static void main(String args[])
{
	info();
}
static void info()
{
System.out.println("java version is "+System.getProperty("java.version"));
System.out.println("OS is "+System.getProperty("os.name"));
System.out.println("user logged in is "+System.getProperty("user.name"));
System.out.println("JVM is  "+System.getProperty("java.vm.name"));
System.out.println("Vendor is  "+System.getProperty("java.vendor"));
}
}
