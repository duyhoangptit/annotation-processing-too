package vn.hoangptit.log;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DevLog {
	public static final String LOG_FILE = "C:/APT/log.txt";

	public static void log(Object message) {
		if (message == null) {
			return;
		}

		// Make sure the path exists.
		new File(LOG_FILE).getParentFile().mkdirs();
		//
		FileWriter writer = null;
		try {
			writer = new FileWriter(LOG_FILE, true);
			writer.append(System.currentTimeMillis() + " " + message.toString());
			writer.append("\n");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
}
