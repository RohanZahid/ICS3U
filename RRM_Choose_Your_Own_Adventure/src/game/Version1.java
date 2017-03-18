package game;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import java.awt.Color;

import hsa_new.Console;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
public class Version1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, IOException {
		String item, playGame, action, choice, evidence, license = null, decision, weapon, revenge, bed, where1, where2, talk1, talk2, pickup, again = null;
		String answer = null;
		String passCode = "2";
		int f = 0;
		int e = 0;
		int d = 0;
		int b = 0;
		int a = 0;
		int s = 0;

		boolean play = true; 
		Console c = new Console(29,65);
		do
		{
			passCode = "2"; //resets the passCode
			s = 0;
			Thread MUSIC = new Thread() {
				public void run() {
					try {
						Clip theme = AudioSystem.getClip(); //create the clip object
						theme.open(AudioSystem.getAudioInputStream(new File("resources/opening2.wav"))); //open the given file for the clip
							theme.start();
							//theme.loop(Clip.LOOP_CONTINUOUSLY);
							Thread.sleep(5000);
							theme.stop();
						
						
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
				};
			BufferedImage jpgImage = null;
			BufferedImage gifImage = null;
			try {
				jpgImage = ImageIO.read(new File("resources/titlescreen1.jpg"));
				gifImage = ImageIO.read(new File ("resources/opening_sequence.gif"));
			} catch (IOException e1) {
				System.err.println("There was an error loading the image.");
				e1.printStackTrace();
			}
			c.setTextBackgroundColor(Color.black);
			//c.setColor(Color.BLACK);
			c.setTextColor(Color.white);
			c.clear();
			Thread thread1 = new Thread() {
				public void run() {
					while (true) {
						BufferedImage jpgImage = null;
						
						try {
							jpgImage = ImageIO.read(new File("resources/titlescreen1.jpg"));
						} catch (IOException e1) {
							System.err.println("There was an error loading the image.");
							e1.printStackTrace();
						}
						c.drawImage (jpgImage, 0, 60, 500, 500, null);
						try {
							Thread.sleep(150);
						} catch (InterruptedException e14) {
							// TODO Auto-generated catch block
							e14.printStackTrace();
						}
						try {
							jpgImage = ImageIO.read(new File ("resources/titlescreen2.jpg"));
						} catch (IOException e14) {
							// TODO Auto-generated catch block
							e14.printStackTrace();
						}
						c.drawImage (jpgImage, 0, 60, 500, 500, null);
					}
				}
			};
			
			thread1.start();
			MUSIC.start();
			
			playGame = c.readLine();
			while (!playGame.equalsIgnoreCase("start")) { //If "start" is not typed, the game will not start until it is.
				c.clear();
				try {
					jpgImage = ImageIO.read(new File("resources/titlescreen1.jpg"));
				} catch (IOException e1) {
					System.err.println("There was an error loading the image.");
					e1.printStackTrace();
				}
				c.drawImage (jpgImage, 0, 60, 500, 500, null);
				try {
					Thread.sleep(150);
				} catch (InterruptedException e14) {
					// TODO Auto-generated catch block
					e14.printStackTrace();
				}
				try {
					jpgImage = ImageIO.read(new File ("resources/titlescreen2.jpg"));
				} catch (IOException e14) {
					// TODO Auto-generated catch block
					e14.printStackTrace();
				}
				c.drawImage (jpgImage, 0, 60, 500, 500, null);
				playGame = c.readString();
			}
			thread1.stop();
			c.clear();
			c.println("You and your friend walk into a convenience store.");
			c.println("Do you buy food or a drink? (food/drink)");

			Thread thread2 = new Thread() {
				public void run() {
					while (true) {
						BufferedImage gifImage = null;
						try {
							gifImage = ImageIO.read(new File ("resources/opening_sequence.gif"));
						} catch (IOException e1) {
							System.err.println("There was an error loading the image.");
							e1.printStackTrace();
						}
						c.drawImage (gifImage, 0, 60, 500, 500, null);
						//the code below animates separate images.
						try {
							Thread.sleep(150);
						} catch (InterruptedException e14) {
							// TODO Auto-generated catch block
							e14.printStackTrace();
						}
						try {
							gifImage = ImageIO.read(new File ("resources/opening_sequence1.gif"));
						} catch (IOException e14) {
							// TODO Auto-generated catch block
							e14.printStackTrace();
						}
						c.drawImage (gifImage, 0, 60, 500, 500, null);
						try {
							Thread.sleep(150);
						} catch (InterruptedException e13) {
							// TODO Auto-generated catch block
							e13.printStackTrace();
						}
						try {
							gifImage = ImageIO.read(new File ("resources/opening_sequence2.gif"));
						} catch (IOException e12) {
							// TODO Auto-generated catch block
							e12.printStackTrace();
						}
						c.drawImage (gifImage, 0, 60, 500, 500, null);
						try {
							Thread.sleep(150);
						} catch (InterruptedException e11) {
							// TODO Auto-generated catch block
							e11.printStackTrace();
						}
						try {
							gifImage = ImageIO.read(new File ("resources/opening_sequence3.gif"));
						} catch (IOException e10) {
							// TODO Auto-generated catch block
							e10.printStackTrace();
						}
						c.drawImage (gifImage, 0, 60, 500, 500, null);
						try {
							Thread.sleep(150);
						} catch (InterruptedException e9) {
							// TODO Auto-generated catch block
							e9.printStackTrace();
						}
						try {
							gifImage = ImageIO.read(new File ("resources/opening_sequence4.gif"));
						} catch (IOException e8) {
							// TODO Auto-generated catch block
							e8.printStackTrace();
						}
						c.drawImage (gifImage, 0, 60, 500, 500, null);
						try {
							Thread.sleep(150);
						} catch (InterruptedException e7) {
							// TODO Auto-generated catch block
							e7.printStackTrace();
						}
						try {
							gifImage = ImageIO.read(new File ("resources/opening_sequence5.gif"));
						} catch (IOException e6) {
							// TODO Auto-generated catch block
							e6.printStackTrace();
						}
						c.drawImage (gifImage, 0, 60, 500, 500, null);
						try {
							Thread.sleep(150);
						} catch (InterruptedException e5) {
							// TODO Auto-generated catch block
							e5.printStackTrace();
						}
						try {
							gifImage = ImageIO.read(new File ("resources/opening_sequence6.gif"));
						} catch (IOException e4) {
							// TODO Auto-generated catch block
							e4.printStackTrace();
						}
						c.drawImage (gifImage, 0, 60, 500, 500, null);
						try {
							Thread.sleep(150);
						} catch (InterruptedException e3) {
							// TODO Auto-generated catch block
							e3.printStackTrace();
						}
						try {
							gifImage = ImageIO.read(new File ("resources/opening_sequence7.gif"));
						} catch (IOException e2) {
							// TODO Auto-generated catch block
							e2.printStackTrace();
						}
						c.drawImage (gifImage, 0, 60, 500, 500, null);
						try {
							Thread.sleep(150);
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						try {
							gifImage = ImageIO.read(new File ("resources/opening_sequence8.gif"));
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						c.drawImage (gifImage, 0, 60, 500, 500, null);
						
					}
				}
			};
			thread2.start();
			item = c.readString();
			//thread2.interrupt();
			thread2.stop();
			c.clear();
			while (!item.equalsIgnoreCase("food")&&!item.equalsIgnoreCase("drink")) {
				c.clear();
				c.drawImage (gifImage, 0, 60, 500, 500, null);
				c.println("That is not a valid response.");
				c.println("You and your friend walk into a convenience store.");
				c.println("Do you buy food or a drink? (food/drink)");
				item = c.readString();
			}
			if (item.equalsIgnoreCase("drink")) {
				c.clear();
				c.println("You go to the back to get a drink.");
				try {
					Clip theme = AudioSystem.getClip();
					theme.open(AudioSystem.getAudioInputStream(new File("resources/bonesaw.wav"))); //open the given file for the clip
					theme.start();
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				Thread.sleep(3000);
				try {
					Clip theme = AudioSystem.getClip();
					theme.open(AudioSystem.getAudioInputStream(new File("resources/gun.wav"))); //open the given file for the clip
					theme.start();
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				try {
					Clip theme = AudioSystem.getClip();
					theme.open(AudioSystem.getAudioInputStream(new File("resources/dead.wav"))); //open the given file for the clip
					theme.start();
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				c.println("Suddenly, a man with a gun enters to rob the store and ");
				c.println("shoots your friend!" );
				try {
					jpgImage = ImageIO.read(new File ("resources/store_shooting.jpg"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				c.drawImage (jpgImage, 0, 60, 500, 500, null);
				c.println("After the robber leaves, do you help your friend or call the ");
				c.println("police? (help/call)");
				action = c.readString();
				while (!action.equalsIgnoreCase("help")&&!action.equalsIgnoreCase("call")) {
					c.clear();
					c.drawImage (jpgImage, 0, 60, 500, 500, null);
					c.println("That is not a valid response.");
					c.println("After the robber leaves, do you help your friend or call the ");
					c.println("police? (help/call)");
					action = c.readString();
				}
				if (action.equalsIgnoreCase("call")) {
					int x = (int)(Math.random() *10) + 1;
					if (x == 1 ||x == 2||x == 3||x == 4||x == 5||x == 6||x == 7||x == 8||x == 9) {
						c.clear();
						c.println("Your friend dies a PAINFUL death!");
						try {
							jpgImage = ImageIO.read(new File ("resources/mad.jpg"));
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						c.drawImage (jpgImage, 0, 60, 500, 500, null);
						c.println("You are brimming with RAGE. Do you want to get REVENGE?! (Y/N)");
						try {
							Clip theme = AudioSystem.getClip();
							theme.open(AudioSystem.getAudioInputStream(new File("resources/weirdscreaming.wav"))); //open the given file for the clip
							theme.start();
							
						} catch (Exception e1) {
							e1.printStackTrace();
						}
						revenge = c.readString();
						while (!revenge.equalsIgnoreCase("y")&&!revenge.equalsIgnoreCase("n")) {
							c.clear();
							c.drawImage (jpgImage, 0, 60, 500, 500, null);
							c.println("That is not a valid response.");
							c.println("You are brimming with RAGE. Do you want to get REVENGE?! (Y/N)");
							try {
								Clip theme = AudioSystem.getClip();
								theme.open(AudioSystem.getAudioInputStream(new File("resources/weirdscreaming.wav"))); //open the given file for the clip
								theme.start();
								
							} catch (Exception e1) {
								e1.printStackTrace();
							}
							revenge = c.readString();
						}
						while (revenge.equalsIgnoreCase("n")) {
							for (s=0;s<3;s++) {
								if (s == 0) {
									c.clear();
									c.drawImage (jpgImage, 0, 60, 500, 500, null);
									c.println("You are getting depressed... Do you want to get revenge, now? (Y/N)");
									try {
										Clip theme = AudioSystem.getClip();
										theme.open(AudioSystem.getAudioInputStream(new File("resources/weirdscreaming.wav"))); //open the given file for the clip
										theme.start();
										
									} catch (Exception e1) {
										e1.printStackTrace();
									}
									revenge = c.readString();
									while (!revenge.equalsIgnoreCase("y")&&!revenge.equalsIgnoreCase("n")) {
										c.clear();
										c.drawImage (jpgImage, 0, 60, 500, 500, null);
										c.println("You are getting depressed... Do you want to get revenge, now? (Y/N)");
										revenge = c.readString();
										
									
								}
									if (revenge.equalsIgnoreCase("y")) {
										s=5;
									}
								}
								else if (s==1) {
									c.clear();
									c.println("You get depressed to the point of no return... and commit suicide.");
									try {
										jpgImage = ImageIO.read(new File ("resources/sad.jpg"));
									} catch (IOException e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
									c.drawImage (jpgImage, 0, 60, 500, 500, null);
									try {
										Clip theme = AudioSystem.getClip();
										theme.open(AudioSystem.getAudioInputStream(new File("resources/gameover.wav"))); //open the given file for the clip
										theme.start();
										
									} catch (Exception e1) {
										e1.printStackTrace();
									}
								}
								else {
									revenge = "dw";
								}
							}
						}




						if (revenge.equalsIgnoreCase("y")) {
							c.clear();
							c.println("You go back to the shop to get evidence.");
							try {
								gifImage = ImageIO.read(new File ("resources/opening_sequence4.gif"));
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							c.drawImage (gifImage, 0, 80, 500, 500, null);
							c.println("Do you look for the evidence in the garbage or at the shooting ");
							c.println("site? (garbage/site)");
							evidence = c.readString();
							
							while (!evidence.equalsIgnoreCase("garbage")&&!evidence.equalsIgnoreCase("site")) {
								c.clear();
								c.drawImage (gifImage, 0, 80, 500, 500, null);
								c.println("That is not a valid response.");
								c.println("Do you look for the evidence in the garbage or at the shooting site? (garbage/site)");
								evidence = c.readString();
							}
							if (evidence.equalsIgnoreCase("garbage")) {
								c.clear();
								c.println("You do not find anything important. There is a half-eaten cheeseburger though...");
								c.println("You then go to the shooting site and find the driver's licence of the shooter.");
								try {
									jpgImage = ImageIO.read(new File ("resources/license.jpg"));
								} catch (IOException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								c.drawImage (jpgImage, 0, 80, 500, 500, null);
								c.println("Do you keep the license, or give it to the police?(keep/give)");
								license = c.readString();
								while (!license.equalsIgnoreCase("keep")&&!license.equalsIgnoreCase("give")) {
									c.clear();
									c.println("That is not a valid response.");
									c.drawImage (jpgImage, 0, 80, 500, 500, null);
									c.println("Do you keep the license, or give it to the police?(keep/give)");
									license = c.readString();
								}
								if (license.equalsIgnoreCase("keep")){
									c.clear();
									c.println("You see the address on the license and go there...");
									try {
										jpgImage = ImageIO.read(new File ("resources/house.jpg"));
									} catch (IOException e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
									c.drawImage (jpgImage, 0, 80, 500, 500, null);
									try {
										Clip theme = AudioSystem.getClip();
										theme.open(AudioSystem.getAudioInputStream(new File("resources/siren.wav"))); //open the given file for the clip
										theme.start();
										
									} catch (Exception e1) {
										e1.printStackTrace();
									}
									c.println("When you get there, the police are outside the residence.");
									c.println("Do you give up or go through the back door? (quit/door)");
									decision = c.readString();
									while (!decision.equalsIgnoreCase("quit")&&!decision.equalsIgnoreCase("door")) {
										c.clear();
										c.drawImage (jpgImage, 0, 80, 500, 500, null);
										c.println("That is not a valid response.");
										c.println("Do you give up or go through the back door? (quit/door)");
										decision = c.readString();
									}
									if (decision.equalsIgnoreCase("door")) {
										c.clear();
										c.println("The back door is open and you enter. You find a gun and a fire extinguisher.");
										c.println("Which do you choose? (gun/extinguisher)");
										try {
											jpgImage = ImageIO.read(new File ("resources/weapon.jpg"));
										} catch (IOException e1) {
											// TODO Auto-generated catch block
											e1.printStackTrace();
										}
										c.drawImage (jpgImage, 0, 80, 500, 500, null);
										weapon = c.readString();
										while (!weapon.equalsIgnoreCase("gun")&&!weapon.equalsIgnoreCase("extinguisher")) {
											c.clear();
											c.println("That is not a valid response.");
											c.drawImage (jpgImage, 0, 80, 500, 500, null);
											c.println("Which do you choose? (gun/extinguisher)");
											weapon = c.readString();
										}
										if(weapon.equalsIgnoreCase("extinguisher")) {
											c.clear();
											try {
												Clip theme = AudioSystem.getClip();
												theme.open(AudioSystem.getAudioInputStream(new File("resources/screaming2.wav"))); //open the given file for the clip
												theme.start();
												
											} catch (Exception e1) {
												e1.printStackTrace();
											}
											try {
												Clip theme = AudioSystem.getClip();
												theme.open(AudioSystem.getAudioInputStream(new File("resources/breaking.wav"))); //open the given file for the clip
												theme.start();
												
											} catch (Exception e1) {
												e1.printStackTrace();
											}
											Thread.sleep(5000);
											c.println("You hit the shooter on the head with the fire extinguisher, and  he gets knocked out.");
											try {
												jpgImage = ImageIO.read(new File ("resources/hit.jpg"));
											} catch (IOException e1) {
												// TODO Auto-generated catch block
												e1.printStackTrace();
											}
											c.drawImage (jpgImage, 0, 80, 500, 500, null);
											Thread.sleep(3000);
											c.println("The police hear the noise and come inside.They arrest the shooter and  are about to arrest you, but they take the half-eaten ");
											c.println("cheeseburger instead.");
											try {
												Clip theme = AudioSystem.getClip();
												theme.open(AudioSystem.getAudioInputStream(new File("resources/ending.wav"))); //open the given file for the clip
												theme.start();
												Thread.sleep(5000);
											} catch (Exception e1) {
												e1.printStackTrace();
											}
											c.println("Thank You for playing!");
											c.println("Do you want to play again?   (Y/N)");
											again = c.readString();
											while (!again.equalsIgnoreCase("y")&&!again.equalsIgnoreCase("n")) {
												c.clear();
												c.drawImage (jpgImage, 0, 80, 500, 500, null);
												c.println("That is not a valid response.");
												c.println("Thank You for playing!");
												c.println("Do you want to play again?   (Y/N)");
												again = c.readString();
											}
											if (again.equalsIgnoreCase("y")) {
												play = true;
												c.clear();
											}
											else if (again.equalsIgnoreCase("n")) {
												play = false;
											}
										}
										else if (weapon.equalsIgnoreCase("gun")){
											c.clear();
											c.println("You grab the gun, but it's filled with blanks.");
											try {
												Clip theme = AudioSystem.getClip();
												theme.open(AudioSystem.getAudioInputStream(new File("resources/screaming3.wav"))); //open the given file for the clip
												theme.start();
											} catch (Exception e1) {
												e1.printStackTrace();
											}
											try {
												Clip theme = AudioSystem.getClip();
												theme.open(AudioSystem.getAudioInputStream(new File("resources/laugh.wav"))); //open the given file for the clip
												theme.start();
											} catch (Exception e1) {
												e1.printStackTrace();
											}
											try {
												Clip theme = AudioSystem.getClip();
												theme.open(AudioSystem.getAudioInputStream(new File("resources/stab.wav"))); //open the given file for the clip
												theme.loop(Clip.LOOP_CONTINUOUSLY);
												Thread.sleep(5000);
												theme.stop();
												
											} catch (Exception e1) {
												e1.printStackTrace();
											}
											try {
												jpgImage = ImageIO.read(new File ("resources/dead.jpg"));
											} catch (IOException e1) {
												// TODO Auto-generated catch block
												e1.printStackTrace();
											}
											c.drawImage (jpgImage, 0, 80, 500, 500, null);
											c.println("The robber hears you and stabs you to a PAINFUL DEATH!");
											try {
												Clip theme = AudioSystem.getClip();
												theme.open(AudioSystem.getAudioInputStream(new File("resources/gameover.wav"))); //open the given file for the clip
												theme.start();
												
											} catch (Exception e1) {
												e1.printStackTrace();
											}
											c.println("Thank You for playing!");
											c.println("Do you want to play again?   (Y/N)");
											again = c.readString();
											while (!again.equalsIgnoreCase("y")&&!again.equalsIgnoreCase("n")) {
												c.clear();
												c.drawImage (jpgImage, 0, 80, 500, 500, null);
												c.println("That is not a valid response.");
												c.println("Thank You for playing!");
												c.println("Do you want to play again?   (Y/N)");
												again = c.readString();
											}
											if (again.equalsIgnoreCase("y")) {
												play = true;
												c.clear();
											}
											else if (again.equalsIgnoreCase("n")) {
												play = false;
											}
										}
									}
									else if (decision.equalsIgnoreCase("quit")) {
										c.clear();
										try {
											jpgImage = ImageIO.read(new File ("resources/newhome.jpg"));
										} catch (IOException e1) {
											// TODO Auto-generated catch block
											e1.printStackTrace();
										}
										c.drawImage (jpgImage, 0, 80, 500, 500, null);
										c.println("You give up and go home.");
										try {
											Clip theme = AudioSystem.getClip();
											theme.open(AudioSystem.getAudioInputStream(new File("resources/ending.wav"))); //open the given file for the clip
											theme.start();
											Thread.sleep(5000);
											
										} catch (Exception e1) {
											e1.printStackTrace();
										}
										c.println("Yes. That is your home. You used to live at your ");
										c.println("friend's place after you were kicked out by your parents.");
										c.println("Thank You for playing!");
										
										c.println("Do you want to play again?   (Y/N)");
										again = c.readString();
										while (!again.equalsIgnoreCase("y")&&!again.equalsIgnoreCase("n")) {
											c.clear();
											c.drawImage (jpgImage, 0, 80, 500, 500, null);
											c.println("That is not a valid response.");
											c.println("Thank You for playing!");
											c.println("Do you want to play again?   (Y/N)");
											again = c.readString();
										}
										if (again.equalsIgnoreCase("y")) {
											play = true;
											c.clear();
										}
										else if (again.equalsIgnoreCase("n")) {
											play = false;
										}
									}
								}
								else if (license.equalsIgnoreCase("give")) {
									c.clear();
									try {
										Clip theme = AudioSystem.getClip();
										theme.open(AudioSystem.getAudioInputStream(new File("resources/handcuffs.wav"))); //open the given file for the clip
										theme.start();
									} catch (Exception e1) {
										e1.printStackTrace();
									}
									c.println("The cops take the license and find the robber.");
									try {
										jpgImage = ImageIO.read(new File ("resources/arrested.jpg"));
									} catch (IOException e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
									try {
										Clip theme = AudioSystem.getClip();
										theme.open(AudioSystem.getAudioInputStream(new File("resources/ending.wav"))); //open the given file for the clip
										theme.start();
										Thread.sleep(5000);
										
									} catch (Exception e1) {
										e1.printStackTrace();
									}
									c.drawImage (jpgImage, 0, 80, 500, 500, null);
									c.println("Thank You for playing!");
									c.println("Do you want to play again?   (Y/N)");
									again = c.readString();
									while (!again.equalsIgnoreCase("y")&&!again.equalsIgnoreCase("n")) {
										c.clear();
										c.drawImage (jpgImage, 0, 80, 500, 500, null);
										c.println("That is not a valid response.");
										c.println("Thank You for playing!");
										c.println("Do you want to play again?   (Y/N)");
										again = c.readString();
									}
									if (again.equalsIgnoreCase("y")) {
										c.clear();
										play = true;
									}
									else if (again.equalsIgnoreCase("n")) {
										play = false;
									}
								}
							}
							else if (evidence.equalsIgnoreCase("site")) {
								c.clear();
								c.println("You find the driver's licence of the shooter.");
								try {
									jpgImage = ImageIO.read(new File ("resources/license.jpg"));
								} catch (IOException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								c.drawImage (jpgImage, 0, 80, 500, 500, null);
								c.println("Do you keep the license, or give it to the police?(keep/give)");
								license = c.readString();
								while (!license.equalsIgnoreCase("keep")&&!license.equalsIgnoreCase("give")) {
									c.clear();
									c.drawImage (jpgImage, 0, 80, 500, 500, null);
									c.println("That is not a valid response.");
									c.println("Do you keep the license, or give it to the police?(keep/give)");
									license = c.readString();
								}
								if (license.equalsIgnoreCase("keep")){
									c.clear();
									c.println("You see the address on the license and go there...");
									try {
										jpgImage = ImageIO.read(new File ("resources/house.jpg"));
									} catch (IOException e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
									c.drawImage (jpgImage, 0, 80, 500, 500, null);
									try {
										Clip theme = AudioSystem.getClip();
										theme.open(AudioSystem.getAudioInputStream(new File("resources/siren.wav"))); //open the given file for the clip
										theme.start();
										
									} catch (Exception e1) {
										e1.printStackTrace();
									}
									c.println("When you get there, the police are outside the residence.");
									c.println("Do you give up or go through the back door? (quit/door)");
									decision = c.readString();
									while (!decision.equalsIgnoreCase("quit")&&!decision.equalsIgnoreCase("door")) {
										c.clear();
										c.drawImage (jpgImage, 0, 80, 500, 500, null);
										c.println("That is not a valid response.");
										c.println("Do you give up or go through the back door? (quit/door)");
										decision = c.readString();
									}
									if (decision.equalsIgnoreCase("door")) {
										
										c.clear();
										c.println("The back door is open and you enter. You find a gun and a fire extinguisher.");
										c.println("Which do you choose? (gun/extinguisher)");
										try {
											jpgImage = ImageIO.read(new File ("resources/weapon.jpg"));
										} catch (IOException e1) {
											// TODO Auto-generated catch block
											e1.printStackTrace();
										}
										c.drawImage (jpgImage, 0, 80, 500, 500, null);
										weapon = c.readString();
										while (!weapon.equalsIgnoreCase("gun")&&!weapon.equalsIgnoreCase("extinguisher")) {
											c.clear();
											c.drawImage (jpgImage, 0, 80, 500, 500, null);
											c.println("That is not a valid response.");
											c.println("Which do you choose? (gun/extinguisher)");
											weapon = c.readString();
										}
										if(weapon.equalsIgnoreCase("extinguisher")) {
											c.clear();
											try {
												Clip theme = AudioSystem.getClip();
												theme.open(AudioSystem.getAudioInputStream(new File("resources/screaming2.wav"))); //open the given file for the clip
												theme.start();
												
											} catch (Exception e1) {
												e1.printStackTrace();
											}
											try {
												Clip theme = AudioSystem.getClip();
												theme.open(AudioSystem.getAudioInputStream(new File("resources/breaking.wav"))); //open the given file for the clip
												theme.start();
												
											} catch (Exception e1) {
												e1.printStackTrace();
											}
											Thread.sleep(5000);
											c.println("You hit the shooter on the head with the fire extinguisher, and  he gets knocked out.");
											try {
												jpgImage = ImageIO.read(new File ("resources/hit.jpg"));
											} catch (IOException e1) {
												// TODO Auto-generated catch block
												e1.printStackTrace();
											}
											c.drawImage (jpgImage, 0, 80, 500, 500, null);
											Thread.sleep(3000);
											c.println("The police hear the noise and come inside.They arrest the shooter and arrest you.");
											try {
												jpgImage = ImageIO.read(new File ("resources/arrested2.jpg"));
											} catch (IOException e1) {
												// TODO Auto-generated catch block
												e1.printStackTrace();
											}
											try {
												Clip theme = AudioSystem.getClip();
												theme.open(AudioSystem.getAudioInputStream(new File("resources/ending.wav"))); //open the given file for the clip
												theme.start();
												Thread.sleep(5000);
												
											} catch (Exception e1) {
												e1.printStackTrace();
											}
											c.drawImage (jpgImage, 0, 80, 500, 500, null);
											c.println("Thank You for playing!");
											c.println("Do you want to play again?   (Y/N)");
											again = c.readString();
											while (!again.equalsIgnoreCase("y")&&!again.equalsIgnoreCase("n")) {
												c.clear();
												c.drawImage (jpgImage, 0, 80, 500, 500, null);
												c.println("That is not a valid response.");
												c.println("Thank You for playing!");
												c.println("Do you want to play again?   (Y/N)");
												again = c.readString();
											}
											if (again.equalsIgnoreCase("y")) {
												play = true;
												c.clear();
											}
											else if (again.equalsIgnoreCase("n")) {
												play = false;
											}
										}
										else if (weapon.equalsIgnoreCase("gun")){
											c.clear();
											c.println("You grab the gun, but it's filled with blanks.");
											try {
												Clip theme = AudioSystem.getClip();
												theme.open(AudioSystem.getAudioInputStream(new File("resources/screaming3.wav"))); //open the given file for the clip
												theme.start();
											} catch (Exception e1) {
												e1.printStackTrace();
											}
											try {
												Clip theme = AudioSystem.getClip();
												theme.open(AudioSystem.getAudioInputStream(new File("resources/laugh.wav"))); //open the given file for the clip
												theme.start();
											} catch (Exception e1) {
												e1.printStackTrace();
											}
											try {
												Clip theme = AudioSystem.getClip();
												theme.open(AudioSystem.getAudioInputStream(new File("resources/stab.wav"))); //open the given file for the clip
												theme.loop(Clip.LOOP_CONTINUOUSLY);
												Thread.sleep(5000);
												theme.stop();
												
											} catch (Exception e1) {
												e1.printStackTrace();
											}
											try {
												jpgImage = ImageIO.read(new File ("resources/dead.jpg"));
											} catch (IOException e1) {
												// TODO Auto-generated catch block
												e1.printStackTrace();
											}
											c.drawImage (jpgImage, 0, 80, 500, 500, null);
											c.println("The robber hears you and stabs you to a PAINFUL DEATH!");
											try {
												Clip theme = AudioSystem.getClip();
												theme.open(AudioSystem.getAudioInputStream(new File("resources/gameover.wav"))); //open the given file for the clip
												theme.start();
												Thread.sleep(5000);
												
											} catch (Exception e1) {
												e1.printStackTrace();
											}
											c.clear();
											c.drawImage (jpgImage, 0, 80, 500, 500, null);
											c.println("Thank You for playing!");
											c.println("Do you want to play again?   (Y/N)");
											again = c.readString();
											while (!again.equalsIgnoreCase("y")&&!again.equalsIgnoreCase("n")) {
												c.clear();
												c.drawImage (jpgImage, 0, 80, 500, 500, null);
												c.println("That is not a valid response.");
												c.println("Thank You for playing!");
												c.println("Do you want to play again?   (Y/N)");
												again = c.readString();
											}
											if (again.equalsIgnoreCase("y")) {
												play = true;
												c.clear();
											}
											else if (again.equalsIgnoreCase("n")) {
												play = false;
											}
										}
									}
									else if (decision.equalsIgnoreCase("quit")){
										c.clear();
										c.println("You give up and go home.");
										try {
											jpgImage = ImageIO.read(new File ("resources/newhome.jpg"));
										} catch (IOException e1) {
											// TODO Auto-generated catch block
											e1.printStackTrace();
										}
										c.drawImage (jpgImage, 0, 80, 500, 500, null);
										try {
											Clip theme = AudioSystem.getClip();
											theme.open(AudioSystem.getAudioInputStream(new File("resources/ending.wav"))); //open the given file for the clip
											theme.start();
											Thread.sleep(5000);
											
										} catch (Exception e1) {
											e1.printStackTrace();
										}
										c.println("Yes. That is your home. You used to live at your ");
										c.println("friend's place after you were kicked out by your parents.");
										c.println("Thank You for playing!");
										c.println("Do you want to play again?   (Y/N)");
										again = c.readString();
										while (!again.equalsIgnoreCase("y")&&!again.equalsIgnoreCase("n")) {
											c.clear();
											c.drawImage (jpgImage, 0, 80, 500, 500, null);
											c.println("That is not a valid response.");
											c.println("Thank You for playing!");
											c.println("Do you want to play again?   (Y/N)");
											again = c.readString();
										}
										if (again.equalsIgnoreCase("y")) {
											play = true;
											c.clear();
										}
										else if (again.equalsIgnoreCase("n")) {
											play = false;
										}
									}
								}
								else if (license.equalsIgnoreCase("give")) {
									c.clear();
									c.println("The cops take the license and find the robber.");
									try {
										jpgImage = ImageIO.read(new File ("resources/arrested.jpg"));
									} catch (IOException e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
									c.drawImage (jpgImage, 0, 80, 500, 500, null);
									try {
										Clip theme = AudioSystem.getClip();
										theme.open(AudioSystem.getAudioInputStream(new File("resources/ending.wav"))); //open the given file for the clip
										theme.start();
										Thread.sleep(5000);
										
									} catch (Exception e1) {
										e1.printStackTrace();
									}
									c.println("Thank You for playing!");
									c.println("Do you want to play again?   (Y/N)");
									again = c.readString();
									while (!again.equalsIgnoreCase("y")&&!again.equalsIgnoreCase("n")) {
										c.clear();
										c.drawImage (jpgImage, 0, 80, 500, 500, null);
										c.println("That is not a valid response.");
										c.println("Thank You for playing!");
										c.println("Do you want to play again?   (Y/N)");
										again = c.readString();
									}
									if (again.equalsIgnoreCase("y")) {
										play = true;
										c.clear();
									}
									else if (again.equalsIgnoreCase("n")) {
										play = false;
									}
								}
							}
						}
						else if (revenge.equals("dw")) {
							c.drawImage (jpgImage, 0, 80, 500, 500, null);
							c.println("Thank You for playing!");
							c.println("Do you want to play again?   (Y/N)");
							again = c.readString();
							while (!again.equalsIgnoreCase("y")&&!again.equalsIgnoreCase("n")) {
								c.clear();
								c.drawImage (jpgImage, 0, 80, 500, 500, null);
								c.println("That is not a valid response.");
								c.println("Thank You for playing!");
								c.println("Do you want to play again?   (Y/N)");
								again = c.readString();
							}
							if (again.equalsIgnoreCase("y")) {
								play = true;
								c.clear();
							}
							else if (again.equalsIgnoreCase("n")) {
								play = false;
							}
						}
					}
					else {  
						try {
							jpgImage = ImageIO.read(new File ("resources/questover.jpg"));
						} catch (IOException e14) {
							// TODO Auto-generated catch block
							e14.printStackTrace();
						}
						c.drawImage (jpgImage, 0, 60, 500, 500, null);
						c.println("Your friend is rushed to the hospital and survives. The criminal is apprehended.");
						c.println("You both live the rest of your lives content with knowing that the robber is in prison.");
						try {
							Clip theme = AudioSystem.getClip();
							theme.open(AudioSystem.getAudioInputStream(new File("resources/ending.wav"))); //open the given file for the clip
							theme.start();
							Thread.sleep(5000);
							
						} catch (Exception e1) {
							e1.printStackTrace();
						}
						c.clear();
						c.drawImage (jpgImage, 0, 80, 500, 500, null);
						c.println("Thank You for playing!");
						c.println("Do you want to play again?   (Y/N)");
						again = c.readString();
						while (!again.equalsIgnoreCase("y")&&!again.equalsIgnoreCase("n")) {
							c.clear();
							c.drawImage (jpgImage, 0, 80, 500, 500, null);
							c.println("That is not a valid response.");
							c.println("Thank You for playing!");
							c.println("Do you want to play again?   (Y/N)");
							again = c.readString();
						}
						if (again.equalsIgnoreCase("y")) {
							play = true;
							c.clear();
						}
						else if (again.equalsIgnoreCase("n")) {
							play = false;
						}
					}
				}
				else if (action.equalsIgnoreCase("help")){
					c.clear();
					try {
						jpgImage = ImageIO.read(new File ("resources/questover.jpg"));
					} catch (IOException e14) {
						// TODO Auto-generated catch block
						e14.printStackTrace();
					}
					c.drawImage (jpgImage, 0, 60, 500, 500, null);
					c.println("Your friend miraculously survives!");
					c.println("However, the robber is never caught and both of you eventually forget about the incident.");
					try {
						Clip theme = AudioSystem.getClip();
						theme.open(AudioSystem.getAudioInputStream(new File("resources/ending.wav"))); //open the given file for the clip
						theme.start();
						Thread.sleep(5000);
						
					} catch (Exception e1) {
						e1.printStackTrace();
					}
					c.clear();
					c.drawImage (jpgImage, 0, 80, 500, 500, null);
					c.println("Thank You for playing!");
					c.println("Do you want to play again?   (Y/N)");
					again = c.readString();
					while (!again.equalsIgnoreCase("y")&&!again.equalsIgnoreCase("n")) {
						c.clear();
						c.drawImage (jpgImage, 0, 80, 500, 500, null);
						c.println("That is not a valid response.");
						c.println("Thank You for playing!");
						c.println("Do you want to play again?   (Y/N)");
						again = c.readString();
					}
					if (again.equalsIgnoreCase("y")) {
						play = true;
						c.clear();
					}
					else if (again.equalsIgnoreCase("n")) {
						play = false;
					}
				}
			}

			else if (item.equalsIgnoreCase("food")) {
				c.clear();
				c.println("As you go to get food, a masked burgular enters the store and shoots everyone.");
				try {
					Clip theme = AudioSystem.getClip();
					theme.open(AudioSystem.getAudioInputStream(new File("resources/bonesaw.wav"))); //open the given file for the clip
					theme.start();
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				Thread.sleep(3000);
				try {
					Clip theme = AudioSystem.getClip();
					theme.open(AudioSystem.getAudioInputStream(new File("resources/gun.wav"))); //open the given file for the clip
					theme.start();
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				try {
					Clip theme = AudioSystem.getClip();
					theme.open(AudioSystem.getAudioInputStream(new File("resources/dead.wav"))); //open the given file for the clip
					theme.start();
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				try {
					Clip theme = AudioSystem.getClip();
					theme.open(AudioSystem.getAudioInputStream(new File("resources/screaming2.wav"))); //open the given file for the clip
					theme.start();
					Thread.sleep(2000);
					theme.stop();
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				try {
					Clip theme = AudioSystem.getClip();
					theme.open(AudioSystem.getAudioInputStream(new File("resources/screaming.wav"))); //open the given file for the clip
					theme.start();
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				try {
					Clip theme = AudioSystem.getClip();
					theme.open(AudioSystem.getAudioInputStream(new File("resources/screaming3.wav"))); //open the given file for the clip
					theme.start();
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				try {
					Clip theme = AudioSystem.getClip();
					theme.open(AudioSystem.getAudioInputStream(new File("resources/gun.wav"))); //open the given file for the clip
					theme.start();
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				try {
					Clip theme = AudioSystem.getClip();
					theme.open(AudioSystem.getAudioInputStream(new File("resources/gun.wav"))); //open the given file for the clip
					theme.start();
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				Thread.sleep(3000);
				c.println("You wake up in a windowless room. You are lying in a bed.");
				c.println("Do you get up?(y/n)");
				bed = c.readString();
				while (!bed.equalsIgnoreCase("y")&&!bed.equalsIgnoreCase("n")) {
					c.clear();
					c.println("That is not a valid response.");
					c.println("You wake up in a windowless room. You are lying in a bed.");
					c.println("Do you get up?(y/n)");
					bed = c.readString();
				}
				if (bed.equalsIgnoreCase("y")) {
					c.clear();
					c.println("You get out of bed. It's very dark.");
					c.println("Do you go forward, left, or right? (f/l/r)");
					where1 = c.readString();
					while (!where1.equalsIgnoreCase("f")&&!where1.equalsIgnoreCase("l")&&!where1.equalsIgnoreCase("r")) {
						c.clear();
						c.println("That is not a valid response.");
						c.println("Do you go forward, left, or right? (f/l/r)");
						where1 = c.readString();
					}
					while(where1.equalsIgnoreCase("l")) {
						c.clear();
						c.println("You do not find anything and return.");
						c.println("Do you go forward, left, or right? (f/l/r)");
						where1 = c.readString();
						while (!where1.equalsIgnoreCase("f")&&!where1.equalsIgnoreCase("l")&&!where1.equalsIgnoreCase("r")) {
							c.clear();
							c.println("That is not a valid response.");
							c.println("Do you go forward, left, or right? (f/l/r)");
							where1 = c.readString();
						}

					}
					if (where1.equalsIgnoreCase("f")) {
						c.clear();
						c.println("While you are walking forward, your foot touches something. ");
						c.println("You pick it up and push the button on it.");
						c.println("It is a flashlight!");
						try {
							Clip theme = AudioSystem.getClip();
							theme.open(AudioSystem.getAudioInputStream(new File("resources/opendoor.wav"))); //open the given file for the clip
							theme.start();
							
						} catch (Exception e1) {
							e1.printStackTrace();
						}
						c.println("You can see the whole room now.");
						try {
							jpgImage = ImageIO.read(new File ("resources/room.jpg"));
						} catch (IOException e14) {
							// TODO Auto-generated catch block
							e14.printStackTrace();
						}
						c.drawImage (jpgImage, 0, 80, 500, 500, null);
						Thread.sleep(5000);
						c.clear();
						c.drawImage (jpgImage, 0, 80, 500, 500, null);
						c.println("In front of you, there is a bag.");
						c.println("To the left, there is a bookshelf.");
						c.println("To the right, there is a bottomless pit.");
						c.println("Where do you go? (f/l/r)");
						where2 = c.readString();
						while (!where2.equalsIgnoreCase("f")&&!where2.equalsIgnoreCase("l")&&!where2.equalsIgnoreCase("r")) {
							c.clear();
							c.drawImage (jpgImage, 0, 80, 500, 500, null);
							c.println("That is not a valid response.");
							c.println("Do you go forward, left, or right? (f/l/r)");
							where2 = c.readString();
						}
						if (where2.equalsIgnoreCase("f")) {
							c.clear();
							c.println("You pick up the bag and find a key.");
							c.println("As you pick up the key, you notice a trap door under the bed and inspect it.");
							try {
								jpgImage = ImageIO.read(new File ("resources/trapdoor.jpg"));
							} catch (IOException e14) {
								// TODO Auto-generated catch block
								e14.printStackTrace();
							}
							c.drawImage (jpgImage, 0, 80, 500, 500, null);
							c.println("You try unlocking the door with the key.");
							int [] combo = {a, b, d, e, f};
							for (int i =0; i<5; i++){
								combo[i] = (int)(Math.random() *26) + 1;
								passCode = passCode + combo[i];
							}

							c.println("Enter the following: " + passCode);
							answer = c.readString();
							int x = (int)(Math.random() *10) + 1;
							while (!answer.equalsIgnoreCase(passCode)) {
								for (s =0; s<2; s++)
								{
									if (s == 0) {
										c.clear();
										c.drawImage (jpgImage, 0, 80, 500, 500, null);
										c.println("You have 2 more chances.");
										c.println("Enter the following: " + passCode);
										answer = c.readString();
										if (answer.equalsIgnoreCase(passCode)) {
											s = 5;
										}
									}
									else if (s == 1) {
										c.clear();
										c.drawImage (jpgImage, 0, 80, 500, 500, null);
										c.println("You have one last chance.");
										c.println("Enter the following: " + passCode);
										answer = c.readString();
										if (answer.equalsIgnoreCase(passCode)) {
											s = 5;
										}
									}
									else if (s == 2) {
										c.clear();
										try {
											jpgImage = ImageIO.read(new File ("resources/sad.jpg"));
										} catch (IOException e14) {
											// TODO Auto-generated catch block
											e14.printStackTrace();
										}
										c.drawImage (jpgImage, 0, 80, 500, 500, null);
										c.println("You get depressed to the point of no return... and DIE!");
										try {
											Clip theme = AudioSystem.getClip();
											theme.open(AudioSystem.getAudioInputStream(new File("resources/gameover.wav"))); //open the given file for the clip
											theme.start();
											
										} catch (Exception e1) {
											e1.printStackTrace();
										}
										c.println("Thank You for playing!");
										c.println("Do you want to play again?   (Y/N)");
										again = c.readString();
										while (!again.equalsIgnoreCase("y")&&!again.equalsIgnoreCase("n")) {
											c.clear();
											c.drawImage (jpgImage, 0, 80, 500, 500, null);
											c.println("That is not a valid response.");
											c.println("Thank You for playing!");
											c.println("Do you want to play again?   (Y/N)");
											again = c.readString();
										}
										if (again.equalsIgnoreCase("y")) {
											play = true;
											c.clear();
										}
										else if (again.equalsIgnoreCase("n")) {
											play = false;
										}
									}
								}
							}
							if (x == 1 ||x == 2||x == 3||x == 4||x == 5) {
								c.clear();
								try {
									jpgImage = ImageIO.read(new File ("resources/eyes.jpg"));
								} catch (IOException e14) {
									// TODO Auto-generated catch block
									e14.printStackTrace();
								}
								c.drawImage (jpgImage, 0, 80, 500, 500, null);
								try {
									Clip theme = AudioSystem.getClip();
									theme.open(AudioSystem.getAudioInputStream(new File("resources/screaming3.wav"))); //open the given file for the clip
									theme.start();
									
								} catch (Exception e1) {
									e1.printStackTrace();
								}
								c.println("The key breaks. Pieces go in your eyes and you die...");
								c.println("Thank You for playing!");
								try {
									Clip theme = AudioSystem.getClip();
									theme.open(AudioSystem.getAudioInputStream(new File("resources/gameover.wav"))); //open the given file for the clip
									theme.start();
									
								} catch (Exception e1) {
									e1.printStackTrace();
								}
								Thread.sleep(5000);
								c.println("Do you want to play again?   (Y/N)");
								again = c.readString();
								while (!again.equalsIgnoreCase("y")&&!again.equalsIgnoreCase("n")) {
									c.clear();
									c.drawImage (jpgImage, 0, 80, 500, 500, null);
									c.println("That is not a valid response.");
									c.println("Thank You for playing!");
									c.println("Do you want to play again?   (Y/N)");
									again = c.readString();
								}
								if (again.equalsIgnoreCase("y")) {
									play = true;
									c.clear();
								}
								else if (again.equalsIgnoreCase("n")) {
									play = false;
								}
								
							}
							else if (answer.equalsIgnoreCase(passCode)){
								c.clear();
								try {
									Clip theme = AudioSystem.getClip();
									theme.open(AudioSystem.getAudioInputStream(new File("resources/opendoor.wav"))); //open the given file for the clip
									theme.start();
									
								} catch (Exception e1) {
									e1.printStackTrace();
								}
								c.println("The door opens.");
								try {
									jpgImage = ImageIO.read(new File ("resources/hospital.jpg"));
								} catch (IOException e14) {
									// TODO Auto-generated catch block
									e14.printStackTrace();
								}
								c.drawImage (jpgImage, 0, 80, 500, 500, null);
								c.println("The room goes black. Your eyes open. People are around you.");
								c.println("You hear a man exclaim 'Its a miracle!'");
								c.println("What do you say? A:Where am I? or B:What happened...(A/B) ");
								talk1=c.readString();
								while (!talk1.equalsIgnoreCase("a")&&!talk1.equalsIgnoreCase("b")) {
									c.clear();
									c.drawImage (jpgImage, 0, 80, 500, 500, null);
									c.println("That is not a valid response.");
									c.println("What do you say? A:Where am I? or B:What happened...(A/B) ");
									talk1=c.readString();
								}
								if(talk1.equalsIgnoreCase("A")){
									c.clear();
									c.drawImage (jpgImage, 0, 80, 500, 500, null);
									c.println("Man: You are in a Toronto Central Hospital");
									c.println("C: Will I be alright?");
									c.println("D: Did you find the shooter?		(C/D)");
									talk2=c.readString();
									while (!talk2.equalsIgnoreCase("c")&&!talk2.equalsIgnoreCase("d")) {
										c.clear();
										c.drawImage (jpgImage, 0, 80, 500, 500, null);
										c.println("That is not a valid response.");
										c.println("C: Will I be alright?");
										c.println("D: Did you find the shooter?		(C/D)");
										talk2=c.readString();
									}
									if(talk2.equalsIgnoreCase("C")) {
										c.clear();
										c.drawImage (jpgImage, 0, 80, 500, 500, null);
										c.println("Man: Yes, you will be able to leave the hospital after 3 weeks of physiotherapy.");
										c.println("After you leave the hospital, you meet with your friend and discuss what happened.");
										Thread.sleep(5000);
										c.clear();
										c.println("Unfortunately the shooter was never caught...");
										try {
											jpgImage = ImageIO.read(new File ("resources/gotaway.jpg"));
										} catch (IOException e14) {
											// TODO Auto-generated catch block
											e14.printStackTrace();
										}
										try {
											Clip theme = AudioSystem.getClip();
											theme.open(AudioSystem.getAudioInputStream(new File("resources/laugh.wav"))); //open the given file for the clip
											theme.start();
											
										} catch (Exception e1) {
											e1.printStackTrace();
										}
										c.drawImage (jpgImage, 0, 80, 500, 500, null);
										c.println("Thank You for playing!");
										c.println("Do you want to play again?   (Y/N)");
										again = c.readString();
										while (!again.equalsIgnoreCase("y")&&!again.equalsIgnoreCase("n")) {
											c.clear();
											c.drawImage (jpgImage, 0, 80, 500, 500, null);
											c.println("That is not a valid response.");
											c.println("Thank You for playing!");
											c.println("Do you want to play again?   (Y/N)");
											again = c.readString();
										}
										if (again.equalsIgnoreCase("y")) {
											play = true;
											c.clear();
										}
										else if (again.equalsIgnoreCase("n")) {
											play = false;
										}

									}


									else if(talk2.equalsIgnoreCase("D")) {
										c.clear();
										c.drawImage (jpgImage, 0, 80, 500, 500, null);
										c.println("Man: I am pleased to announce the shooter has been apprehended by the police.");
										c.println("Man: He was found hiding out in a dumpster.");
										c.println("Man: The shooter will serve the maximum sentence of");
										c.println(" in Kingston penitentiary.");
										try {
											jpgImage = ImageIO.read(new File ("resources/questover.jpg"));
										} catch (IOException e14) {
											// TODO Auto-generated catch block
											e14.printStackTrace();
										}
										try {
											Clip theme = AudioSystem.getClip();
											theme.open(AudioSystem.getAudioInputStream(new File("resources/ending.wav"))); //open the given file for the clip
											theme.start();
											Thread.sleep(5000);
											
										} catch (Exception e1) {
											e1.printStackTrace();
										}
										c.drawImage (jpgImage, 0, 80, 500, 500, null);
										Thread.sleep(5000);
										c.clear();
										c.drawImage (jpgImage, 0, 80, 500, 500, null);
										c.println("Thank You for playing!");
										c.println("Do you want to play again?   (Y/N)");
										again = c.readString();
										while (!again.equalsIgnoreCase("y")&&!again.equalsIgnoreCase("n")) {
											c.clear();
											c.drawImage (jpgImage, 0, 80, 500, 500, null);
											c.println("That is not a valid response.");
											c.println("Thank You for playing!");
											c.println("Do you want to play again?   (Y/N)");
											again = c.readString();
										}
										if (again.equalsIgnoreCase("y")) {
											play = true;
											c.clear();
										}
										else if (again.equalsIgnoreCase("n")) {
											play = false;
										}
									}

								}
								else if(talk1.equalsIgnoreCase("B")) { 
									c.clear();
									try {
										jpgImage = ImageIO.read(new File ("resources/hospital.jpg"));
									} catch (IOException e14) {
										// TODO Auto-generated catch block
										e14.printStackTrace();
									}
									c.drawImage (jpgImage, 0, 80, 500, 500, null);
									c.println("Man: You and your friend were shot and then brought to the hospital");
									c.println("Man: You need to stay here until you are both healthy again.");
									Thread.sleep(5000);
									c.clear();
									try {
										jpgImage = ImageIO.read(new File ("resources/questover.jpg"));
									} catch (IOException e14) {
										// TODO Auto-generated catch block
										e14.printStackTrace();
									}
									
									c.drawImage (jpgImage, 0, 80, 500, 500, null);
									
									c.println("After 3 weeks you and your friend return to your normal lives... of selling drugs.");
									try {
										Clip theme = AudioSystem.getClip();
										theme.open(AudioSystem.getAudioInputStream(new File("resources/ending.wav"))); //open the given file for the clip
										theme.start();
										Thread.sleep(5000);
										
									} catch (Exception e1) {
										e1.printStackTrace();
									}
									c.println("Thank You for playing!");
									c.println("Do you want to play again?   (Y/N)");
									again = c.readString();
									while (!again.equalsIgnoreCase("y")&&!again.equalsIgnoreCase("n")) {
										c.clear();
										c.drawImage (jpgImage, 0, 80, 500, 500, null);
										c.println("That is not a valid response.");
										c.println("Thank You for playing!");
										c.println("Do you want to play again?   (Y/N)");
										again = c.readString();
									}
									if (again.equalsIgnoreCase("y")) {
										play = true;
										c.clear();
									}
									else if (again.equalsIgnoreCase("n")) {
										play = false;
									}
								}
							}
							else{
								c.clear();
								c.println("wrong.");
							}

						}
						else if (where2.equalsIgnoreCase("l")) {
							c.clear();
							try {
								jpgImage = ImageIO.read(new File ("resources/lockpick.jpg"));
							} catch (IOException e14) {
								// TODO Auto-generated catch block
								e14.printStackTrace();
							}
							c.drawImage (jpgImage, 0, 80, 500, 500, null);
							c.println("You find a lockpick at the bottom of a bookshelf. Do you pick it up? (Y/N)");
							pickup = c.readString();
							while (!pickup.equalsIgnoreCase("y")&&!pickup.equalsIgnoreCase("n")) {
								c.clear();
								c.drawImage (jpgImage, 0, 80, 500, 500, null);
								c.println("That is not a valid response.");
								c.println("You find a lockpick at the bottom of a bookshelf. Do you pick it up? (Y/N)");
								pickup = c.readString();
							}
							if (pickup.equalsIgnoreCase("y")) {
								c.clear();
								c.println("As you pick up the lock pick, you see a trap door under the bed and inspect it.");
								try {
									jpgImage = ImageIO.read(new File ("resources/trapdoor.jpg"));
								} catch (IOException e14) {
									// TODO Auto-generated catch block
									e14.printStackTrace();
								}
								c.drawImage (jpgImage, 0, 80, 500, 500, null);
								int [] combo = {a, b, d, e, f};
								for (int i =0; i<5; i++){
									combo[i] = (int)(Math.random() *26) + 1;
									passCode = passCode + combo[i];
								}
								c.println("Enter the following: " + passCode);
								answer = c.readString();
								while (!answer.equalsIgnoreCase(passCode)) {
									for (s =0; s<2; s++)
									{
										if (s == 0) {
											c.clear();
											c.drawImage (jpgImage, 0, 80, 500, 500, null);
											c.println("You have 2 more chances.");
											c.println("Enter the following: " + passCode);
											answer = c.readString();
										}
										else if (s == 1) {
											c.clear();
											c.drawImage (jpgImage, 0, 80, 500, 500, null);
											c.println("You have one last chance.");
											c.println("Enter the following: " + passCode);
											answer = c.readString();
										}
										else if (s == 2) {
											c.clear();
											c.println("You get depressed to the point of no return... and DIE!.");
											try {
												jpgImage = ImageIO.read(new File ("resources/sad.jpg"));
											} catch (IOException e14) {
												// TODO Auto-generated catch block
												e14.printStackTrace();
											}
											try {
												Clip theme = AudioSystem.getClip();
												theme.open(AudioSystem.getAudioInputStream(new File("resources/gameover.wav"))); //open the given file for the clip
												theme.start();
												
											} catch (Exception e1) {
												e1.printStackTrace();
											}
											c.drawImage (jpgImage, 0, 80, 500, 500, null);
											Thread.sleep(5000);
											c.clear();
											c.drawImage (jpgImage, 0, 80, 500, 500, null);
											c.println("Thank You for playing!");
											c.println("Do you want to play again?   (Y/N)");
											again = c.readString();
											while (!again.equalsIgnoreCase("y")&&!again.equalsIgnoreCase("n")) {
												c.clear();
												c.drawImage (jpgImage, 0, 80, 500, 500, null);
												c.println("That is not a valid response.");
												c.println("Thank You for playing!");
												c.println("Do you want to play again?   (Y/N)");
												again = c.readString();
											}
											if (again.equalsIgnoreCase("y")) {
												play = true;
												c.clear();
											}
											else if (again.equalsIgnoreCase("n")) {
												play = false;
											}

										}
									}
								}

									if (answer.equalsIgnoreCase(passCode)){
										c.clear();
										try {
											Clip theme = AudioSystem.getClip();
											theme.open(AudioSystem.getAudioInputStream(new File("resources/opendoor.wav"))); //open the given file for the clip
											theme.start();
										
										} catch (Exception e1) {
											e1.printStackTrace();
										}
										c.println("The door opens.");
										try {
											jpgImage = ImageIO.read(new File ("resources/hospital.jpg"));
										} catch (IOException e14) {
											// TODO Auto-generated catch block
											e14.printStackTrace();
										}
										c.drawImage (jpgImage, 0, 80, 500, 500, null);
										c.println("The room goes black. Your eyes open. People are around you.");
										c.println("You hear a man exclaim 'Its a miracle!'");
										c.println("What do you say? A:Where am I? or B:What happened...(A/B) ");
										talk1=c.readString();
										while (!talk1.equalsIgnoreCase("a")&&!talk1.equalsIgnoreCase("b")) {
											c.clear();
											c.drawImage (jpgImage, 0, 80, 500, 500, null);
											c.println("That is not a valid response.");
											c.println("What do you say? A:Where am I? or B:What happened...(A/B) ");
											talk1=c.readString();
										}


										if(talk1.equalsIgnoreCase("A")){
											c.clear();
											c.drawImage (jpgImage, 0, 80, 500, 500, null);
											c.println("Man: You are in the Mississauga Central Hospital");
											c.println("C: Will I be alright? D: Did you find the shooter? (C/D)");
											talk2=c.readString();
											while (!talk2.equalsIgnoreCase("c")&&!talk2.equalsIgnoreCase("d")) {
												c.clear();
												c.drawImage (jpgImage, 0, 80, 500, 500, null);
												c.println("That is not a valid response.");
												c.println("C: Will I be alright? D: Did you find the shooter? (C/D)");
												talk2=c.readString();
											}
											if(talk2.equalsIgnoreCase("C")) {
												c.clear();
												c.drawImage (jpgImage, 0, 80, 500, 500, null);
												c.println("Man: Yes, but you won't be able to walk normally ever again.");
												c.println("After you leave the hospital, you go home and eat a shawarma and burrito.");
												try {
													jpgImage = ImageIO.read(new File ("resources/food.jpg"));
												} catch (IOException e14) {
													// TODO Auto-generated catch block
													e14.printStackTrace();
												}
												c.drawImage (jpgImage, 0, 80, 500, 500, null);
												Thread.sleep(5000);
												c.clear();
												try {
													jpgImage = ImageIO.read(new File ("resources/gotaway.jpg"));
												} catch (IOException e14) {
													// TODO Auto-generated catch block
													e14.printStackTrace();
												}
												c.drawImage (jpgImage, 0, 80, 500, 500, null);
												c.println("Unfortunately the shooter was never caught...");
												try {
													Clip theme = AudioSystem.getClip();
													theme.open(AudioSystem.getAudioInputStream(new File("resources/laugh.wav"))); //open the given file for the clip
													theme.start();
													
												} catch (Exception e1) {
													e1.printStackTrace();
												}
												c.println("Thank You for playing!");
												c.println("Do you want to play again?   (Y/N)");
												again = c.readString();
												if (again.equalsIgnoreCase("y")) {
													play = true;
													c.clear();
												}
												else if (again.equalsIgnoreCase("n")) {
													play = false;
												}

											}

											else if(talk2.equalsIgnoreCase("D")) {
												c.clear();
												c.println("Man: The shooter got away, but I won a TV from roll up the rim.");
												c.println("Man: I found the cup at the scene of the shooting.");
												c.println("Man: You should come watch TV with me sometime...");
												try {
													jpgImage = ImageIO.read(new File ("resources/rollup.jpg"));
												} catch (IOException e14) {
													// TODO Auto-generated catch block
													e14.printStackTrace();
												}
												c.drawImage (jpgImage, 0, 80, 500, 500, null);
												try {
													Clip theme = AudioSystem.getClip();
													theme.open(AudioSystem.getAudioInputStream(new File("resources/ending.wav"))); //open the given file for the clip
													theme.start();
													Thread.sleep(5000);
													
												} catch (Exception e1) {
													e1.printStackTrace();
												}
												Thread.sleep(5000);
												c.clear();
												c.drawImage (jpgImage, 0, 80, 500, 500, null);
												c.println("Thank You for playing!");
												c.println("Do you want to play again?   (Y/N)");
												again = c.readString();
												while (!again.equalsIgnoreCase("y")&&!again.equalsIgnoreCase("n")) {
													c.clear();
													c.drawImage (jpgImage, 0, 80, 500, 500, null);
													c.println("That is not a valid response.");
													c.println("Thank You for playing!");
													c.println("Do you want to play again?   (Y/N)");
													again = c.readString();
												}
												if (again.equalsIgnoreCase("y")) {
													play = true;
													c.clear();
												}
												else if (again.equalsIgnoreCase("n")) {
													play = false;
												}
											}

										}
										else if(talk1.equalsIgnoreCase("B")) { 
											c.clear();
											c.println("Man: You and your friend were shot and then brought to the hospital");
											c.println("Man: You need to stay here until you are both rejuvenated.");
											try {
												jpgImage = ImageIO.read(new File ("resources/hospital.jpg"));
											} catch (IOException e14) {
												// TODO Auto-generated catch block
												e14.printStackTrace();
											}
											c.drawImage (jpgImage, 0, 80, 500, 500, null);
											Thread.sleep(5000);
											c.clear();
											c.println("After 3 weeks you and your friend return to your normal lives... of robbing banks.");
											try {
												jpgImage = ImageIO.read(new File ("resources/questover.jpg"));
											} catch (IOException e14) {
												// TODO Auto-generated catch block
												e14.printStackTrace();
											}
											
											c.drawImage (jpgImage, 0, 80, 500, 500, null);
											try {
												Clip theme = AudioSystem.getClip();
												theme.open(AudioSystem.getAudioInputStream(new File("resources/ending.wav"))); //open the given file for the clip
												theme.start();
												Thread.sleep(5000);
												
											} catch (Exception e1) {
												e1.printStackTrace();
											}
											c.println("Thank You for playing!");
											c.println("Do you want to play again?   (Y/N)");
											again = c.readString();
											while (!again.equalsIgnoreCase("y")&&!again.equalsIgnoreCase("n")) {
												c.clear();
												c.drawImage (jpgImage, 0, 80, 500, 500, null);
												c.println("That is not a valid response.");
												c.println("Thank You for playing!");
												c.println("Do you want to play again?   (Y/N)");
												again = c.readString();
											}
											if (again.equalsIgnoreCase("y")) {
												play = true;
												c.clear();
											}
											else if (again.equalsIgnoreCase("n")) {
												play = false;
											}
										}
									}
									else {
										c.println("wrong.");
									}

								
							}
							else if (pickup.equalsIgnoreCase("n")) {
								c.clear();
								c.println("As you move away from the bookshelf, you fall into the pit and DIE!");
								try {
									jpgImage = ImageIO.read(new File ("resources/fall.jpg"));
								} catch (IOException e14) {
									// TODO Auto-generated catch block
									e14.printStackTrace();
								}
								
								try {
									Clip theme = AudioSystem.getClip();
									theme.open(AudioSystem.getAudioInputStream(new File("resources/screaming3.wav"))); //open the given file for the clip
									theme.start();
									
								} catch (Exception e1) {
									e1.printStackTrace();
								}
								c.drawImage (jpgImage, 0, 80, 500, 500, null);
								try {
									Clip theme = AudioSystem.getClip();
									theme.open(AudioSystem.getAudioInputStream(new File("resources/gameover.wav"))); //open the given file for the clip
									theme.start();
									
								} catch (Exception e1) {
									e1.printStackTrace();
								}
								Thread.sleep(5000);
								c.clear();
								c.println("Thank You for playing!");
								c.println("Do you want to play again?   (Y/N)");
								again = c.readString();
								while (!again.equalsIgnoreCase("y")&&!again.equalsIgnoreCase("n")) {
									c.clear();
									c.println("That is not a valid response.");
									c.println("Thank You for playing!");
									c.println("Do you want to play again?   (Y/N)");
									again = c.readString();
								}
								if (again.equalsIgnoreCase("y")) {
									play = true;
									c.clear();
								}
								else if (again.equalsIgnoreCase("n")) {
									play = false;
								}
							}
						}
						else if (where2.equalsIgnoreCase("r")) {
							c.clear();
							c.println("You walk into a bottomless pit and DIE!");
							try {
								jpgImage = ImageIO.read(new File ("resources/fall.jpg"));
							} catch (IOException e14) {
								// TODO Auto-generated catch block
								e14.printStackTrace();
							}
							try {
								Clip theme = AudioSystem.getClip();
								theme.open(AudioSystem.getAudioInputStream(new File("resources/screaming3.wav"))); //open the given file for the clip
								theme.start();
								
							} catch (Exception e1) {
								e1.printStackTrace();
							}
							try {
								Clip theme = AudioSystem.getClip();
								theme.open(AudioSystem.getAudioInputStream(new File("resources/gameover.wav"))); //open the given file for the clip
								theme.start();
								
							} catch (Exception e1) {
								e1.printStackTrace();
							}
							c.drawImage (jpgImage, 0, 80, 500, 500, null);
							Thread.sleep(5000);
							c.clear();
							c.println("Thank You for playing!");
							c.println("Do you want to play again?   (Y/N)");
							again = c.readString();
							while (!again.equalsIgnoreCase("y")&&!again.equalsIgnoreCase("n")) {
								c.clear();
								c.drawImage (jpgImage, 0, 80, 500, 500, null);
								c.println("That is not a valid response.");
								c.println("Thank You for playing!");
								c.println("Do you want to play again?   (Y/N)");
								again = c.readString();
							}
							if (again.equalsIgnoreCase("y")) {
								play = true;
								c.clear();
							}
							else if (again.equalsIgnoreCase("n")) {
								play = false;
							}
						}

					}

					else if (where1.equalsIgnoreCase("r")) {
						c.clear();
						try {
							jpgImage = ImageIO.read(new File ("resources/fall.jpg"));
						} catch (IOException e14) {
							// TODO Auto-generated catch block
							e14.printStackTrace();
						}
						try {
							Clip theme = AudioSystem.getClip();
							theme.open(AudioSystem.getAudioInputStream(new File("resources/screaming3.wav"))); //open the given file for the clip
							theme.start();
							
						} catch (Exception e1) {
							e1.printStackTrace();
						}
						c.drawImage (jpgImage, 0, 80, 500, 500, null);
						c.println("You fall into a bottomless pit and DIE!");
						
						try {
							Clip theme = AudioSystem.getClip();
							theme.open(AudioSystem.getAudioInputStream(new File("resources/gameover.wav"))); //open the given file for the clip
							theme.start();
							
						} catch (Exception e1) {
							e1.printStackTrace();
						}
						Thread.sleep(5000);
						c.clear();
						c.println("Thank You for playing!");
						c.println("Do you want to play again?   (Y/N)");
						again = c.readString();
						while (!again.equalsIgnoreCase("y")&&!again.equalsIgnoreCase("n")) {
							c.clear();
							c.drawImage (jpgImage, 0, 80, 500, 500, null);
							c.println("That is not a valid response.");
							c.println("Thank You for playing!");
							c.println("Do you want to play again?   (Y/N)");
							again = c.readString();
						}
						if (again.equalsIgnoreCase("y")) {
							c.clear();
							play = true;
						}
						else if (again.equalsIgnoreCase("n")) {
							play = false;
						}
					}
				}
				else if (bed.equalsIgnoreCase("n")) {
					c.clear();
					try {
						jpgImage = ImageIO.read(new File ("resources/sad.jpg"));
					} catch (IOException e14) {
						// TODO Auto-generated catch block
						e14.printStackTrace();
					}
					c.drawImage (jpgImage, 0, 80, 500, 500, null);
					c.println("You hear a voice, 'Let's take him off life support! ");
					c.println("Mwahahahahahahah!'");
					c.println("You feel a sharp pain and DIE!");
					try {
						Clip theme = AudioSystem.getClip();
						theme.open(AudioSystem.getAudioInputStream(new File("resources/gameover.wav"))); //open the given file for the clip
						theme.start();
						
					} catch (Exception e1) {
						e1.printStackTrace();
					}
					c.println("Thank You for playing!");
					c.println("Do you want to play again?   (Y/N)");
					again = c.readString();
					while (!again.equalsIgnoreCase("y")&&!again.equalsIgnoreCase("n")) {
						c.clear();
						c.drawImage (jpgImage, 0, 80, 500, 500, null);
						c.println("That is not a valid response.");
						c.println("Thank You for playing!");
						c.println("Do you want to play again?   (Y/N)");
						again = c.readString();
					}
					if (again.equalsIgnoreCase("y")) {
						c.clear();
						play = true;
					}
					else if (again.equalsIgnoreCase("n")) {
						play = false;
					}
				}

			}
		} while(play == true);
		c.clear();
		c.close();
	}

}