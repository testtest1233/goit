package com.goit.offline3.Diagram333;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Runner {

	public static void main(String[] args) {
		// Создаем магазин
		MisicStore store = new MisicStore();
		// Создаем ассортимент
		Map<String, Integer> instruments = new HashMap<>();
		instruments.put(MusicalInstruments.PIANO, 5);
		instruments.put(MusicalInstruments.GUITAR, 0);
		instruments.put(MusicalInstruments.TRUMPET, 0);

		// Инициализируем магазин этим ассортиментом
		store.setMusicalInstrumentses(instruments);

		Map<String, Integer> order = new HashMap<>();
		order.put(MusicalInstruments.PIANO, 7);

		List<MusicalInstruments> list;
		try {
			list = store.prepareInstruments(order);
			for (MusicalInstruments instrument : list) {
				System.out.println(instrument);
			}
		} catch (NotEnoughInstrument e) {
			System.out.println("Not enough instruments on the store " + e.getMessage());
		}

	}

}
