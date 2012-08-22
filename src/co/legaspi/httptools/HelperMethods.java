package co.legaspi.httptools;

import java.util.Random;

public class HelperMethods {

	private static final String[] LIPSUM = {
		"Lorem ipsum dolor sit amet, consectetur adipiscing elit",
		"Phasellus dictum nunc ut tellus suscipit porta",
		"Proin vel urna eu enim consequat malesuada quis a lorem",
		"Curabitur blandit accumsan arcu, eget ornare nibh iaculis ut",
		"Curabitur in erat lectus, eu rutrum tortor",
		"Fusce auctor tellus est, eget consectetur ante",
		"Ut rutrum mattis velit, eget accumsan tellus tempus ut",
		"Pellentesque bibendum tincidunt ligula, ut pulvinar lacus pellentesque vitae",
		"Donec sit amet mi ac est euismod aliquam",
		"Nam imperdiet lectus a lorem pulvinar quis auctor erat tincidunt",
		"Vivamus gravida diam vestibulum risus placerat pulvinar",
		"Maecenas vehicula felis ac dui semper at vehicula nisi suscipit",
		"Suspendisse ac tellus ac justo mattis mollis",
		"Spam Musubi + MSG - 25% sodium = Yummy"
	};
	
	private static final String[] MSISDNS = {
		"+12128430049",
		"+12128430050",
		"+12128430051",
		"+12128430052",
		"+12128430053",
		"+12128430054",
		"+12128430055",
		"+12128430056",
		"+12128430057",
		"+12128430058",
		
		"+12128430022",
		"+12128430023",
		
		"+12128420101",
		"+12128430038",
		"+12128430037",
		"+12128220293",
		"+12128330155",
		"+12148410102",
		
		"+11234567890",
		"+19876543210",
		"+14259165181",
		"+12067964132",
		"+13607859142",
		"+15029784432",
		"+14239081763",
		"+18085266103",
		"+17027936845",
		"+12139320876",
		
		"28846910",
        "28846909",
        "28846906",
        "28846907",

        "4040411",
        "61412"
	};

	/**
	 * Generate quasi-random 'lipsum' phrase from a static list of phrases 
	 * @return A String containing a quasi-random phrase 
	 */
	public static String randomLipsum() {
		return LIPSUM[randomIntGenerator(LIPSUM.length)];
	}
	
	/**
	 * Generate quasi-random MSISDN (including +1) from a static list of MSISDNs 
	 * @return A String containing a quasi-random MSISDN 
	 */
	public static String randomMsisdn() {
		return MSISDNS[randomIntGenerator(MSISDNS.length)]; 
	}
	
	/**
	 * Generate Random int from zero to max
	 * @param max Highest random int to generate (minus 1?)
	 * @return Random int
	 */
	public static int randomIntGenerator(int max) {
		Random generator = new Random();
		return generator.nextInt(max);
	}
}
