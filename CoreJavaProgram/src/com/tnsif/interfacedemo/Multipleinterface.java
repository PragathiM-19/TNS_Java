package com.tnsif.interfacedemo;
//demo for multiple level

//first interface
interface Camera{
	void takephoto();
}
//second interface
interface Musicplayer{
	void playmusic();
}
class Smartphone implements Camera,Musicplayer{
	
	@Override
	public void playmusic() {
		System.out.println("Taking a photo with the smartphone");
	}

	@Override
	public void takephoto() {
		System.out.println("Playing music on the smartphone");	
	}
}
public class Multipleinterface {

	public static void main(String[] args) {
		Smartphone s=new Smartphone();
		s.takephoto();
		s.playmusic();
	}
}


