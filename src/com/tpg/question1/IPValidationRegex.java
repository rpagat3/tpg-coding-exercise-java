package com.tpg.question1;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Uses regular expression to validate input IP addresses according to the following criteria: 
 * <ul><li>IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range from 0 to 255.</li>
 * <li>Leading zeros are allowed.</li> 
 * <li>The length of A, B, C, or D can't be greater than 3.</li></ul>
 * <p><b>Input:</b> A text file with a list of IP addresses and have your class read in the file then filter out any invalid IP address(es).</p>
 * <p><b>Output:</b> A list of valid IP address(es).</p>  
 * @author Rey Pagatpatan
 *
 */
public class IPValidationRegex {

	private static final String IP_VALID_REGEX = "(25[0-5]|2[0-4][0-9]|[0-1]?[0-9]{1,2})(\\.)"
			+ "(25[0-5]|2[0-4][0-9]|[0-1]?[0-9]{1,2})(\\.)"
			+ "(25[0-5]|2[0-4][0-9]|[0-1]?[0-9]{1,2})(\\.)"
			+ "(25[0-5]|2[0-4][0-9]|[0-1]?[0-9]{1,2})";
	private static final Pattern pattern = Pattern.compile(IP_VALID_REGEX);
	private static final Charset ENCODING = StandardCharsets.UTF_8;
	
	/**
	 * Reads the IPs within an input stream and displays valid IPs in the console.
	 * @param inputStream The input stream that contains the IPs to be validated.
	 */
	public void processFile(InputStream inputStream) {
		System.out.println("Below are the valid IPs.");
		String ip = null;
		try (Scanner scanner = new Scanner(inputStream, ENCODING.name())) {
			while (scanner.hasNextLine()) {
				ip = scanner.nextLine();
				if(isValid(ip))
					System.out.println(ip);
			}
		}
	}
	
	/**
	 * Reads the IPs within a file and displays valid IPs in the console. The file must be under IPValidationRegex package - com.tpg.question1.
	 * @param fileName The file that contains the IPs to be validated.
	 */
	public void processFile(String fileName) {
		InputStream inputStream = this.getClass().getResourceAsStream(fileName);
		processFile(inputStream);
	}
	
	/**
	 * Determines if the passed IP is valid or not.
	 * @param ip The IP address to be validated.
	 * @return 
	 *    true if the IP conforms to the criteria.
	 */
	public boolean isValid(String ip) {
		Matcher matcher = pattern.matcher(ip);
		return matcher.matches();
	}

	public static void main(String[] args) {
		IPValidationRegex ipvr = new IPValidationRegex();
		ipvr.processFile("test_ip.txt");
	}	
}
