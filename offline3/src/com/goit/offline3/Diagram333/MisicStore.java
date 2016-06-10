package com.goit.offline3.Diagram333;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MisicStore {

	public void calculateTheOrder() {

	}

	private Map<String, Integer> musicalInstrumentses;

	public Map<String, Integer> getMusicalInstrumentses() {
		return musicalInstrumentses;
	}

	public void setMusicalInstrumentses(Map<String, Integer> musicalInstrumentses) {
		this.musicalInstrumentses = musicalInstrumentses;
	}

	public List<MusicalInstruments> prepareInstruments(Map<String, Integer> order) throws NotEnoughInstrument {
		int cntPiano = order.get(MusicalInstruments.PIANO);
		int cntPianoInShop = musicalInstrumentses.get(MusicalInstruments.PIANO);

		if (cntPianoInShop < cntPiano) {
			throw new NotEnoughInstrument("Piano an't enough");
		}

		List<MusicalInstruments> result = new ArrayList<>();
		for (int i = 0; i < cntPiano; i++) {
			result.add(new Piano());
		}
		musicalInstrumentses.put(MusicalInstruments.PIANO, cntPianoInShop - cntPiano);

		return result;
	}
}
