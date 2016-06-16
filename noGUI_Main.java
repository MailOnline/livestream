package LiveStreamModule;

import java.util.ArrayList;

public class noGUI_Main {

	public static void main(String[] args) {
	  StreamGenerator genertor = new StreamGenerator();
	  ArrayList<String> lines = genertor.createTriple("LIVE: HODGSON & ROONEY AT PRESSER BEFORE WALES CLASH", "http://i.dailymail.co.uk/i/pix/2016/06/15/dmvidpics 2016-06-15 at 14.06.50.png", "sport", "http://reuters.dailymail.co.uk/rlo02/smil:576046c5555e803b1ae9b5e6.smil/28052/playlist.m3u8");
	  for(int i=0; i<lines.size(); i++){
		System.out.println(lines.get(i));  
	  }

	}

}
