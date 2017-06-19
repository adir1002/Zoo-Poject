package factory;

import graphics.AddAnimalDialog;
import graphics.ZooPanel;

import java.awt.Color;

import animals.Animal;


/**
 * 
 *  @author Daniel Bromberg 209529882 and Adir Abuhazera 208903765 beer sheba
 *
 */
public class OmnivoreFactory implements AbstractZooFactory{
	
	private AddAnimalDialog dial;
	
	/*
	 * (non-Javadoc)
	 * @see factory.AbstractZooFactory#produceAnimal()
	 */
	@Override
	public Animal produceAnimal() {

	   dial = new AddAnimalDialog(ZooPanel.getInstance(),"Add an animal to zoo","Omnivore");
	   dial.setVisible(true);
	   return dial.getAnimal();
	}

	/*
	 * (non-Javadoc)
	 * @see factory.AbstractZooFactory#getValues(int, int, int, java.awt.Color)
	 */
	@Override
	public void getValues(int size, int verSpeed, int horSpeed, Color c) {
		// TODO Auto-generated method stub
		
	}

}
