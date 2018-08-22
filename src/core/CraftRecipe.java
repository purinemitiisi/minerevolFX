package core;

import java.util.ArrayList;
import java.util.List;

public enum CraftRecipe {
	TABLE() {
		@Override
		void set() {
			inputItemList.add(new Item(ItemData.WOOD, 4));
			outputItem = new Item(ItemData.TABLE, 1);
		}
	},
	STICK() {
		@Override
		void set() {
			inputItemList.add(new Item(ItemData.WOOD, 2));
			outputItem = new Item(ItemData.STICK, 2);
		}
	};

	public List<Item> inputItemList = new ArrayList<Item>();
	public Item outputItem;
	public double craftSpeed;

	private CraftRecipe() {
		set();
	}

	abstract void set();


}
