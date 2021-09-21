package week3.day2.assignment;


public class Abstraction extends Desktop{
	
	@Override
	public void softwareResources(String os, int ram) {
		// TODO Auto-generated method stub
		System.out.println("OS :"+os);
		System.out.println("RAM :"+ram);
		
	}

	@Override
	public void hardwareResources(String dev, String mouse) {
		// TODO Auto-generated method stub
		System.out.println("Devices:"+dev);
		System.out.println("Mouse :"+mouse);
	}

	@Override
	public void desktopfeatures() {
		// TODO Auto-generated method stub
		System.out.println("desktop feature unimplemented abstract method from abstracr class");
	}
	 public static void main(String[] args) {
		 Abstraction ab=new Abstraction();
		 ab.desktopfeatures();
		 ab.hardwareResources("keyboard", "optical mouse");
		 ab.softwareResources("windows10", 8);
		 ab.desktopModel("wipro");//implemented method from abstract class
		 
			
		}

}
