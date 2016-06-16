package LiveStreamModule;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class StreamGenerator {
	
	private String defaultPoster = "http://i.dailymail.co.uk/i/pix/2015/11/04/hunger-games-live-stream-image-overlay-3.jpg";
	
	
	public ArrayList<String> createSingle(String title, String poster, String channel, String src) {
		ArrayList<String> lines = new ArrayList<String>();
		try {
			BufferedReader single = new BufferedReader(new FileReader("single.html"));
			String line = null;
			while ((line = single.readLine()) != null) {
				if (line.contains("$title")) {
					line = line.replace("$title", title);
				}
				if (line.contains("$poster")) {
					line = line.replace("$poster", poster);
				}
				if (line.contains("$src")) {
					line = line.replace("$src", src);
				}
				if (line.contains("$channel")) {
					line = line.replace("$channel", channel);
				}
				lines.add(line);
			}
			single.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lines;
	}
	


	public ArrayList<String> createDouble(String title, String poster, String channel, String src) {
		ArrayList<String> lines = new ArrayList<String>();
		try {
			BufferedReader single = new BufferedReader(new FileReader("double.html"));
			String line = null;
			while ((line = single.readLine()) != null) {
				if (line.contains("$title")) {
					line = line.replace("$title", title);
				}
				if (line.contains("$poster")) {
					line = line.replace("$poster", poster);
				}
				if (line.contains("$src")) {
					line = line.replace("$src", src);
				}
				if (line.contains("$channel")) {
					line = line.replace("$channel", channel);
				}
				lines.add(line);
			}
			single.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lines;
	}
	

	

	public ArrayList<String> createTriple(String title, String poster, String channel, String src) {
		ArrayList<String> lines = new ArrayList<String>();
		try {
			BufferedReader single = new BufferedReader(new FileReader("triple.html"));
			String line = null;
			while ((line = single.readLine()) != null) {
				if (line.contains("$title")) {
					line = line.replace("$title", title);
				}
				if (line.contains("$poster")) {
					line = line.replace("$poster", poster);
				}
				if (line.contains("$src")) {
					line = line.replace("$src", src);
				}
				if (line.contains("$channel")) {
					line = line.replace("$channel", channel);
				}
				lines.add(line);
			}
			single.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lines;
	}

	public String getDefaultPoster() {
		return defaultPoster;
	}

	public void setDefaultPoster(String defaultPoster) {
		this.defaultPoster = defaultPoster;
	}
}