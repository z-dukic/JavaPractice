package Primjer04;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Zadatak7 {

//datumi

	public static void main(String[] args) {
		Date datum;

		Calendar kalendar = GregorianCalendar.getInstance();
		kalendar.set(Calendar.YEAR, 2021);
		kalendar.set(Calendar.MONTH, 2);
		kalendar.set(Calendar.DAY_OF_MONTH, 5);
		datum = kalendar.getTime();

		System.out.println(datum);

		SimpleDateFormat prikaz = new SimpleDateFormat("dd. MM. yyyy");
		System.out.println(prikaz.format(datum));

	}

}
