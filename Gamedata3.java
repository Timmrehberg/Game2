import java.util.Scanner;
public class Gamedata3 {
	
	public static void main(String[] args) {
		Scanner option = new Scanner(System.in);
		
		String Choice1;
		String Choice2;
		String Choice3;
		String Choice4;
		String Choice5;
		String Choice6;
		String Choice7;
		String Choice8;
		String Choice9;
		String Choice10;
		Troll troll1 = new Troll ();
		troll1.name = "Hern";
		troll1.age = 54;
		troll1.speak();
		troll1.hello();
		Troll troll2 = new Troll ();
		troll2.age = 43;
		troll2.name = "Luther";
		troll2.speak();
		troll2.hello();
		// 
		Villagers villager1 = new Villagers ();
		villager1.name = "Lexi";
		villager1.age = 54;
		Villagers villager2 = new Villagers ();
		villager2.name = "Joe";
		villager2.age = 65;
		//
		Rivals rival1 = new Rivals ();
		Rivals rival2 = new Rivals ();
		rival1.name = "Gren";
		rival2.name = "Sven";
		
		
		
		System.out.print ("Shoot the trolls or continue greeting");
		Choice1 = option.next();
		if (Choice1.equals("Shoot")) {
		System.out.print("You killed the trolls: Try again?"); 
		System.exit(0);
		} else { 
			System.out.println("The troll takes you to his village 'Horenza' "); }
			System.out.println("You are  shocked to see there are hundreds of trolls");
			System.out.println(" 2 village trolls run up to you");
			System.out.print("Smack the trolls or greet them");
			Choice2 = option.next();
			if (Choice2.equals("Greet")) {
			villager2.greet();
			villager1.greet();
			
			} else {
				System.out.print("You smack the trolls and get kicked out of the village: Try again?"); 
				System.exit(0);	}
			System.out.println("You meet the head troll of the village");
			System.out.println("Greetings i have a mission for you");
			System.out.println("I need you to go and kill our rival Jorzezzs village do you accept?"); 
			Choice3 = option.next();
			if (Choice3.equals("Yes")) {
				System.out.println("Good now i dont have to murder you"); }
			 else {
				System.out.println("You get killed for disobeying the elder"); }
			System.out.println("Leaving the village you hear a whisper");
			System.out.println("Please dont destroy that village there are many innocents: A: i wont, B: Dont tell me what to do");
			Choice4 = option.next();
			if (Choice4.equals("A")) {
				System.out.print("Thank you very much for your kindess and understanding");
			} else { 
				System.out.println("You a horrible horrible person"); 
				}
			System.out.println("Leaving the village you find a injured troll on the side of the road: A:Rob the troll, B:Help the troll,");
			Choice5 = option.next();
			switch (Choice5) {
			case "A":
				System.out.println("You rob the poor troll and leave him stranded");
				break;
			case "B":
				System.out.println("You help the stranded troll and he tells you that the 'Horenza' tribe is attacking everybody and to stay clear from them ");
				break;
				default: }
			
					System.out.println("You leave the troll on the road");
				System.out.println("You are walking up to the village when all the villagers start to run in terror: You see they arent armed and appear very weak");
				System.out.print("A:Chase after them swinging an axe, B:Attempt to calm them down");
				Choice6 = option.next();
				switch (Choice6) {
				case "A":
					System.out.println("You chase after the villagers Slaughting them all");
					System.out.println("Before finishing off the last villager the weakened troll says  'You are just like the rest of them a heartless savage..' " );
					System.out.println("Upon returning to the village you are greeted by the tribe leader: 'I thank you for exterminating the vermin, A:Confront the Master about what he had you do, B:Accept his thanks");
					Choice7 = option.next();
					if (Choice7.equals("A")) {
						System.out.println("The master kills you for talking to him in front of his people like that");
					} else { System.out.println("I would like to thank you by giving you our most prized horse A:accept the horse and ride off, B: Kill the tribe leader"); 
					Choice8 = option.next(); 
					if (Choice8.equals ("A")){
						System.out.print("You accept the horse and never look back");
					}
						else {System.out.print("You kill the tribe leader and become the villages new master");
						}
					}
				case "B":
					System.out.println("You show the trolls you mean no harm and thats when the master of the village comes outside");
					rival1.negotiate(); 
					System.out.println("He explains to you how the Horenza village has been attacking their members due to land A: Kill him B: Help him");
					Choice9 = option.next();
					if (Choice9.equals("A")){
						System.out.print("You kill Gren and while your back is turned you get speared through the heart:You Died");
					}
					else {
						System.out.println ("You offer to help the village and get rid of the tyrant");
						System.out.print("You devise a plan to attack the village at nightfall");
						System.out.println("You sneak in the village at night and cut off the evil tyrants head");
						System.out.println ("Back at the village they throw you a big celebration and they cant offer you much beside a old cane A: Get pissed and beat him with the cane, B: Accept and leave peacefully");
						Choice10 = option.next();
						if (Choice10.equals("A")) {
							System.out.println("You kill him with the cane and then take over his village as the new evil tyrant"); 
						} 
						else {
							System.out.println("You accept his generous gift and leave peacefully"); 
						}
						
							
						}
					}
						
					}
				}
						
					
				
	

	
	
				
				








					
				
				
					
				
	



	





						



