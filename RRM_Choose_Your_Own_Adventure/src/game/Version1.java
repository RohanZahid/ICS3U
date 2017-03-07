package game;

import java.awt.Color;

import hsa_new.Console;

public class Version1 {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		String item, action, choice, evidence, license = null, decision, weapon, revenge, bed, where1, where2, talk1, talk2, pickup;
		String answer = null;
		String bobby = "2";
		int f = 0;
		int e = 0;
		int d = 0;
		int b = 0;
		int a = 0;
		//whenever an invalid response is recorded,the statement automatically becomes true (bool) for a while loop   
		Console c = new Console();
		
		c.println("You and your friend walk into a convenience store.");
		c.println("Do you buy food or a drink? (food/drink)");
		item = c.readString();
		if (item.equalsIgnoreCase("drink")) {
			c.println("You go to the back to get a drink. Suddenly, a man with a gun enters to rob the store and shoots your friend!" );
			c.println("After the robber leaves, do you help your friend or call the police? (help/call)");
			action = c.readString();
			if (action.equalsIgnoreCase("call")) {
				int x = (int)(Math.random() *10) + 1;
				if (x == 1 ||x == 2||x == 3||x == 4||x == 5||x == 6||x == 7) {
					c.println("Your friend dies a PAINFUL death!");
					c.println("You are brimming with RAGE. Do you want to get REVENGE?! (Y/N)");
					revenge = c.readString();
					if (revenge.equalsIgnoreCase("y")) {
						c.println("You go back to the shop to get evidence");
						c.println("Do you look for the evidence in the garbage or at the shooting site? (garbage/site)");
						evidence = c.readString();
						if (evidence.equalsIgnoreCase("garbage")) {
							c.println("You do not find anything important. There is a half-eaten cheeseburger though...");
							c.println("You then go to the shooting site and find a license.");
							c.println("You find the driver's licence of the shooter.");
							c.println("Do you keep the license, or give it to the police?(keep/give)");
							license = c.readString();
							if (license.equalsIgnoreCase("keep")){
								c.println("You see the address on the license and go there...");
								c.println("When you get there, the police are outside the residence.");
								c.println("Do you give up or go through the back door? (quit/door)");
								decision = c.readString();
								if (decision.equalsIgnoreCase("door")) {
									c.println("The back door is open and you enter. You find a gun and a fire extinguisher.");
									c.println("Which do you choose? (gun/extinguisher)");
									weapon = c.readString();
									if(weapon.equalsIgnoreCase("extinguisher")) {
										c.println("You hit the shooter on the head with the fire extinguisher, and he gets knocked out.");
										c.println("The police hear the noise and come inside.They arrest the shooter and give you $1,000,000 to keep quiet...");
									}
									else if (weapon.equalsIgnoreCase("gun")){
										c.println("You grab the gun, but it's filled with blanks.");
										c.println("The robber hears you and stabs you to a PAINFUL DEATH!");
									}
								}
								else if (decision.equalsIgnoreCase("quit"))
									c.println("You give up and go home.");
							}
						}
						else if (evidence.equalsIgnoreCase("site")) {
							c.println("You find the driver's licence of the shooter.");
							c.println("Do you keep the license, or give it to the police?(keep/give)");
							license = c.readString();
							if (license.equalsIgnoreCase("keep")){
								c.println("You see the address on the license and go there...");
								c.println("When you get there, the police are outside the residence.");
								c.println("Do you give up or go through the back door? (quit/door)");
								decision = c.readString();
								if (decision.equalsIgnoreCase("door")) {
									c.println("The back door is open and you enter. You find a gun and a fire extinguisher.");
									c.println("Which do you choose? (gun/extinguisher)");
									weapon = c.readString();
									if(weapon.equalsIgnoreCase("extinguisher")) {
										c.println("You hit the shooter on the head with the fire extinguisher, and he gets knocked out.");
										c.println("The police hear the noise and come inside.They arrest the shooter and give you $1,000,000 to keep quiet...");
									}
									else if (weapon.equalsIgnoreCase("gun")){
										c.println("You grab the gun, but it's filled with blanks.");
										c.println("The robber hears you and stabs you to a PAINFUL DEATH!");
									}
								}
								else if (decision.equalsIgnoreCase("quit"))
									c.println("You give up and go home.");
							}
						}
						else if (license.equalsIgnoreCase("give"))
							c.println("The cops take the license and find the robber.");
					}
					else if (revenge.equalsIgnoreCase("n"))
						c.println("You live the rest of your life sad...");


				}
				else {  
					c.println("Your friend is rushed to the hospital and survives. The criminal is apprehended.");
					c.println("You both live the rest of your lives content with knowing that the robber is in prison.");
				}
			}
			else if (action.equalsIgnoreCase("help")){
				c.println("Your friend miraculously survives!");
				c.println("However, the robber is never caught and both of you eventually forget about the incident.");
			}
		}

		else if (item.equalsIgnoreCase("food")) {
			c.println("As you go to get food, a masked burgular enters the store and shoots everyone.");
			c.println("You wake up in a windowless room. You are lying in a bed.");
			c.println("Do you get up?(y/n)");
			bed = c.readString();
			if (bed.equalsIgnoreCase("y")) {
				c.println("You get out of bed. It's very dark.");
				c.println("Do you go forward, left, or right? (f/l/r)");
				where1 = c.readString();
				if (where1.equalsIgnoreCase("f")) {
					c.println("While you are walking forward, your foot touches something. You pick it up and push the button on it.");
					c.println("It is a flashlight!");
					c.println("You can see the whole room now.");
					c.println("In front of you, there is a bag.");
					c.println("To the left, there is a bookshelf.");
					c.println("To the right, there is a bottomless pit.");
					c.println("Where do you go? (f/l/r)");
					where2 = c.readString();
					if (where2.equalsIgnoreCase("f")) {
						c.println("You pick up the bag and find a key.");
						c.println("As you pick up the key, you notice a trap door under the bed and inspect it.");
						c.println("You try unlocking the door with the key.");
						int [] combo = {a, b, d, e, f};
						for (int i =0; i<5; i++){
							combo[i] = (int)(Math.random() *26) + 1;
							bobby = bobby + combo[i];
						}

						c.println("Enter the following: " + bobby);
						answer = c.readString();
						int x = (int)(Math.random() *10) + 1;
						if (x == 1 ||x == 2||x == 3||x == 4||x == 5) 
							c.println("The key breaks. Pieces go in your eyes and you die...");
						else if (answer.equalsIgnoreCase(bobby)){
							c.println("The door opens.");
							c.println("The room goes black. Your eyes open. People are around you.");
							c.println("You hear a man exclaim 'Its a miracle!'");
							c.println("What do you say? A:Where am I? or B:What happened...(A/B) ");
							talk1=c.readString();
							if(talk1.equalsIgnoreCase("A")){
								c.println("Man: You are in a Toronto Central Hospital");
								c.println("C: Will I be alright?");
								c.println("D: Did you find the shooter?		(C/D)");
								talk2=c.readString();
								if(talk2.equalsIgnoreCase("C")) {
									c.println("Man: Yes, you will be able to leave the hospital after 3 weeks of physiotherapy.");
									c.println("After you leave the hospital, you meet with your friend and discuss what happened.");
									c.println("Unfortunatly the shooter was never caught...");

								}
								
								 
								else if(talk2.equalsIgnoreCase("D")) {
									c.println("Man: I am pleased to announce the shooter has been apprehended by the police.");
									c.println("Man: He was found hiding out in a dumpster.");
									c.println("Man: The shooter will serve the maximum sentence of 25 years in Kingston penitentiary.");
								}

							}
							else if(talk1.equalsIgnoreCase("B")) { 
								c.println("Man: You and your friend were shot and then brought to the hospital");
								c.println("Man: You need to stay here until you are both healthy again.");
								c.println("After 3 weeks you and your friend return to your normal lives... of selling drugs.");
							}
						}
						else
							c.println("wrong.");


					}
					else if (where2.equalsIgnoreCase("l")) {
						c.println("You find a lockpick at the bottom of a bookshelf. Do you pick it up? (Y/N)");
						pickup = c.readString();
						if (pickup.equalsIgnoreCase("y")) {
							c.println("As you pick up the lock pick, you see a trap door under the bed and inspect it.");
							int [] combo = {a, b, d, e, f};
							for (int i =0; i<5; i++){
								combo[i] = (int)(Math.random() *26) + 1;
								bobby = bobby + combo[i];
							}

							c.println("Enter the following: " + bobby);
							answer = c.readString();
							if (answer.equalsIgnoreCase(bobby)){
								c.println("The door opens.");
								c.println("The room goes black. Your eyes open. People are around you.");
								c.println("You hear a man exclaim 'Its a miracle!'");
								c.println("What do you say? A:Where am I? or B:What happened...(A/B) ");
								talk1=c.readString();


								if(talk1.equalsIgnoreCase("A")){
									c.println("Man: You are in the Mississauga Central Hospital");
									c.println("C: Will I be alright? D: Did you find the shooter? (C/D)");
									talk2=c.readString();
									if(talk2.equalsIgnoreCase("C")) {
										c.println("Man: Yes, but you won't be able to walk normally ever again.");
										c.println("After you leave the hospital, you go home and eat a shawarma and burrito.");
										c.println("Unfortunately the shooter was never caught...");

									}

									else if(talk2.equalsIgnoreCase("D")) {
										c.println("Man: The shooter got away, but I won a TV from roll up the rim.");
										c.println("Man: I found the cup at the scene of the shooting.");
										c.println("Man: You should come watch TV with me sometime...");
									}

								}
								else if(talk1.equalsIgnoreCase("B")) { 
									c.println("Man: You and your friend were shot and then brought to the hospital");
									c.println("Man: You need to stay here until you are both rejuvenated.");
									c.println("After 3 weeks you and your friend return to your normal lives... of selling drugs.");
								}
							}

						}
						else if (pickup.equalsIgnoreCase("n")) {
							c.println("As you move away from the bookshelf, you fall into the pit and DIE!");
						}
					}
					else if (where2.equalsIgnoreCase("r")) {
						c.println("You walk into a bottomless pit and DIE!");
					}


				}
				//make into a while loop.
				else if (where1.equalsIgnoreCase("l")) {
					c.println("You do not find anything and return.");
				}
				else if (where1.equalsIgnoreCase("r")) {
					c.println("You fall into a bottomless pit and DIE!");
				}





			}
			else if (bed.equalsIgnoreCase("n")) {
				c.println("You fall in a deep slumber forever...");
			}

		}

		else {
			
		}

	}

}








