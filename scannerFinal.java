import java.util.Scanner;
public class scannerFinal
{
public static void main (String[]args){
    System.out.println("Hello, I'm your Disney assistant Boki. \nYou can ask me about the personalities, roles and types, brief plot, themes, unique styles,\nor recommendations for other works similar to a Disney character and his or her film.");
    System.out.println("(I recommend you to choose from Cinderella, The Lion King, and The Little Mermaid since I know them best.)");
    System.out.println("You can try to say things like personalities of Cinderella, or if you want to skip, you can say \"exit\"");
    Part1();
    System.out.println("OK, then would you like to match your personalities with Disney characters through a quiz of five questions? Let's start now!");
    Part2();
    System.out.println("Now, would you please answer my following queston? Let's start!");
    Part3();
    System.out.println("Do you wanna hear any Disney secrets or jokes? Yes? Tell me which!");
    Part4();
}
public static void Part1(){
    Scanner cs = new Scanner(System.in);
    String b = "";
    while(true){
    String a = cs.nextLine();
    b = a.toLowerCase();
    if (b.contains("exit"))  {
        System.out.println("OK, let's move on!");
        break;
    }
    if(b.contains("personalit")){
        if(b.contains("cinderella")){
        System.out.println("OK, Cinderella is kind, resilient, optimistic (endures abuse without bitterness).");
        System.out.println("Lady Tremaine is vengeful, greedy (prioritizes daughters’ status over Cinderella).");
        System.out.println("Prince Charming is just, earnest (seeks true love over political marriage).");
        System.out.println("Fairy Godmother is Benevolent (grants Cinderella’s wish to attend the ball).");
        }
        else if(b.contains("lion king")){
        System.out.println("OK, Simba is naive cub, and guilty exile, and responsible king (embodies \"coming of age\").");
        System.out.println("Mufasa is wise, protective (teaches Simba the \"Circle of Life\").");
        System.out.println("Scar is cunning, greedy (kills Mufasa to seize the Pride Lands).");
        }
        else if(b.contains("little mermaid")){
        System.out.println("OK, Ariel is curious, adventurous (trades her voice for legs to explore the human world).");
        System.out.println("Ursula is manipulative, greedy (exploits Ariel to steal King Triton’s power).");
        System.out.println("Eric is kind, open-minded (loves Ariel for her spirit, not her appearance).");
        }
        else{System.out.println("Sorry, I can't answer you. Please try again with Cinderella, The Lion King, or The Little Mermaid.");}
    }
    else if(b.contains("role")||b.contains("type")){
        if(b.contains("cinderella")){
        System.out.println("OK, the protagonist contains Cinderella (virtuous underdog, \"goodness over evil\").");
        System.out.println("the antagonists are Stepfamily (block her happiness to test resilience).");
        System.out.println("the helpers are Fairy Godmother (magic catalyst) and mice (practical support).");
        }
        else if(b.contains("lion king")){
        System.out.println("OK, the protagonist contains Simba (journey from exile to rightful king).");
        System.out.println("the mentor is Mufasa (spiritual guide even after death).");
        System.out.println("the antagonist is Scar (destroys the Pride Lands for power).");
        }
        else if(b.contains("little mermaid")){
        System.out.println("OK, the protagonist contains Ariel (follows her dream, defies her father’s rules).");
        System.out.println("the antagonists is Ursula (uses deception to gain power).");
        System.out.println("the helpers is Sebastian (guides Ariel, bridges her and King Triton).");
        }
        else{System.out.println("Sorry, I can't answer you. Please try again with Cinderella, The Lion King, or The Little Mermaid.");}
    }
    else if(b.contains("plot")){
        if(b.contains("cinderella")){
        System.out.println("OK. Cinderella, abused by her stepfamily, is forbidden from the prince’s ball. \nHer Fairy Godmother uses magic (pumpkin carriage, glass slipper) to send her, but the spell breaks at midnight. \nShe drops a slipper; the prince finds her, and they marry.");
        }
        else if(b.contains("lion king")){
        System.out.println("OK. Scar tricks Simba into a wildebeest stampede, kills Mufasa, and blames Simba. Simba flees, is raised by Timon and Pumbaa (\"Hakuna Matata\"). Nala convinces him to return; he defeats Scar and restores the Pride Lands.");
        }
        else if(b.contains("little mermaid")){
        System.out.println("OK. Ariel saves Eric from a shipwreck and falls in love. Ursula gives her legs (loses voice) to win Eric’s kiss in 3 days. Ursula tricks Eric; Ariel’s friends expose her. Eric kills Ursula; Triton turns Ariel human, and they marry.");
        }
        else{System.out.println("Sorry, I can't answer you. Please try again with Cinderella, The Lion King, or The Little Mermaid.");}
    }
    else if(b.contains("theme")){
        if(b.contains("cinderella")){
        System.out.println("OK. The themes are #1: Goodness triumphs over cruelty. #2: Hope persists in hardship.");
        }
        else if(b.contains("lion king")){
        System.out.println("OK. The themes are #1: The Circle of Life (interconnectedness of nature). #2: Embracing responsibility to one’s identity.");
        }
        else if(b.contains("little mermaid")){
        System.out.println("OK. The themes are #1: Pursue dreams courageously. #2: True love transcends differences (mermaid vs. human).");
        }
        else{System.out.println("Sorry, I can't answer you. Please try again with Cinderella, The Lion King, or The Little Mermaid.");}
    }
    else if(b.contains("style")){
        if(b.contains("cinderella")){
        System.out.println("OK. Cinderella reveals Soft cel animation (pastels for Cinderella, dark tones for stepfamily) and Symbolism: Glass slipper = destiny, pumpkin carriage = humble beginnings.");
        }
        else if(b.contains("lion king")){
        System.out.println("OK. The Lion King reveals African savanna realism (hand-drawn wildlife, golden landscapes) and Fusion score (Elton John’s pop tracks + African chants).");
        }
        else if(b.contains("little mermaid")){
        System.out.println("OK. The Little Mermaid reveals Vibrant underwater animation (fluid movements, colorful coral reefs) and Catchy musical numbers (e.g., \"Part of Your World,\" \"Under the Sea\").");
        }
        else{System.out.println("Sorry, I can't answer you. Please try again with Cinderella, The Lion King, or The Little Mermaid.");}
    }
    else if(b.contains("recommendation")){
        if(b.contains("cinderella")){
        System.out.println("OK, I recommend you: Snow White and the Seven Dwarfs (1937), Cinderella (2015 Live-Action), Beauty and the Beast (1991).");
        }
        else if(b.contains("lion king")){
        System.out.println("OK, I recommend you: The Lion King (2019 Live-Action), Moana (2016), Brave (2012).");
        }
        else if(b.contains("little mermaid")){
        System.out.println("OK, I recommend you: Tangled (2010), Moana (2016), Pocahontas (1995).");
        }
        else{System.out.println("Sorry, I can't answer you. Please try again with Cinderella, The Lion King, or The Little Mermaid.");}
    }
    else{System.out.println("Sorry, I can't answer you. Please try again with \"personalities\", \"roles and types\", \"brief plot\", \"themes\", \"unique styles\", or \"recommendations for other works\"");
    }
    System.out.println("Now, you can try another question. I'm happy to answer you! Or, you can type in \"exit\" to try other functions I have.");
    }
    cs.close();
}
public static void Part2(){
    String c = "";
    
    while(true){
    System.out.println("1. Which core Disney theme do you prefer most?\nA. Classic Animated Films (e.g. Snow White)\nB. Marvel Universe (Disney-owned superheroes)");
    Scanner Answ1 = new Scanner(System.in);
    String Ans1 = Answ1.nextLine();
    String ans1 = Ans1.toLowerCase();
    if(ans1.contains("a")){
    c = c + "a";
        while(true){
        System.out.println("2. Do you prefer:\nA. Princesses (e.g. Snow White, Elsa, Jasmine)\nB. Princes (e.g. Prince Charming, Simba, Aladdin)");
    Scanner Answ2 = new Scanner(System.in);
    String Ans2 = Answ2.nextLine();
    String ans2 = Ans2.toLowerCase();
        if(ans2.contains("a")){c = c + "a";break;}
        else if(ans2.contains("b")){c = c + "b";break;}
        else{System.out.println("Please type in \"A\" or \"B\" to make a choice. Try again.");}
    }
    break;}
    else if(ans1.contains("b")){
    c = c + "b";
        while(true){
        System.out.println("2. Which type of Marvel superhero do you like most?\nA. Tech-Savvy Geniuses (e.g. Iron Man, Shuri)\nB. Super-Strong Protectors (e.g. Captain America, Thor)");
    Scanner Answ2 = new Scanner(System.in);
    String Ans2 = Answ2.nextLine();
    String ans2 = Ans2.toLowerCase();
        if(ans2.contains("a")){c = c + "a";break;}
        else if(ans2.contains("b")){c = c + "b";break;}
        else{System.out.println("Please type in \"A\" or \"B\" to make a choice. Try again.");}
    }
    break;}
    else{System.out.println("Please type in \"A\" or \"B\" to make a choice. Try again.");}
    }
    
    while(true){
    System.out.println("3. What is your gender?\nA. Female\nB. Male");
    Scanner Answ3 = new Scanner(System.in);
    String Ans3 = Answ3.nextLine();
    String ans3 = Ans3.toLowerCase();
    if(ans3.contains("a")){c = c + "a";break;}
        else if(ans3.contains("b")){c = c + "b";break;}
        else{System.out.println("Please type in \"A\" or \"B\" to make a choice. Try again.");}
    }
    
    while(true){
    System.out.println("4. What is your birth month?\nA. Jan–June\nB. Jul–Dec");
    Scanner Answ4 = new Scanner(System.in);
    String Ans4 = Answ4.nextLine();
    String ans4 = Ans4.toLowerCase();
    if(ans4.contains("a")){c = c + "a";break;}
        else if(ans4.contains("b")){c = c + "b";break;}
        else{System.out.println("Please type in \"A\" or \"B\" to make a choice. Try again.");}
    }
    
    while(true){
    System.out.println("5. Which traits best describe your personality?\nA. Outgoing & energetic\nB. Introverted & delicate");
    Scanner Answ5 = new Scanner(System.in);
    String Ans5 = Answ5.nextLine();
    String ans5 = Ans5.toLowerCase();
    if(ans5.contains("a")){c = c + "a";break;}
        else if(ans5.contains("b")){c = c + "b";break;}
        else{System.out.println("Please type in \"A\" or \"B\" to make a choice. Try again.");}
    }
    
    
    if(c.substring(0,1).equals("a")){
    if(c.substring(1,3).equals("aa")){
        if(c.substring(3,5).equals("aa")||c.substring(3,5).equals("ba")){
        System.out.println("Result: Mulan \nYour boldness and leadership align with Mulan’s courageous spirit, breaking tradition to protect others.");
        }
        else{System.out.println("Result: Snow White \nYour innocence and unwavering optimism reflect Snow White’s ability to find joy and trust even in darkness, uniting others through pure-heartedness.");}
    }
    else if(c.substring(1,3).equals("bb")){
        if(c.substring(3,5).equals("aa")||c.substring(3,5).equals("ba")){
        System.out.println("Result: Simba \nYour journey of self-acceptance and courage echoes Simba’s transformation from doubt to leadership, embracing destiny with resilience.");
        }
        else{System.out.println("Result: Aladdin \nYour street-smart charm and adventurous heart reflect Aladdin’s journey from rags to royalty.");}
    }
    else{
        if(c.substring(0,1).equals("a")){
        if(c.substring(3,5).equals("aa")||c.substring(3,5).equals("ba")){
        System.out.println("Result: Maleficent \nYour fierce protectiveness and complexity mirror Maleficent’s duality—a wounded soul who reshapes her narrative through defiance and redemption.");
        }
        else{System.out.println("Result: Beast \nYour depth and transformative nature resonate with the Beast’s emotional arc.");}
        }
    }
    }
    if(c.substring(0,1).equals("b")){
    if(c.equals("baaaa")||c.equals("babaa")){
    System.out.println("Result: Shuri \nYour brilliance and wit mirror Shuri’s innovative genius and playful confidence.");
    }
    else if(c.equals("babab")||c.equals("babbb")){
    System.out.println("Result: Bruce Banner \nYour intellectual depth and quiet strength align with Banner’s scientific mind.");
    }
    else if(c.equals("bbaaa")||c.equals("bbaba")){
    System.out.println("Result: Thor \nYour charisma and heroic spirit echo Thor’s larger-than-life leadership.");
    }
    else if(c.equals("bbbab")||c.equals("bbbbb")){
    System.out.println("Result: Captain America \nYour moral integrity and quiet determination mirror Steve Rogers’ unwavering principles.");
    }
    else{System.out.println("Result: Iron Man \nYour brilliant mind and rebellious spirit reflect Iron Man’s journey—transforming flaws into strength, wielding genius not just for yourself, but to shield the world.");}
    }
}
public static void Part3(){
    System.out.println("Which Disney focus area interests you most?");
    Scanner cs1 = new Scanner(System.in);
    String d = cs1.nextLine();
    String e = d.toLowerCase();
    if(e.contains("independent princesses’ growth journeys")){System.out.println("Ah, you love empowering stories—think Moana’s bravery or Elsa’s self-discovery, where crowns aren’t just worn but earned!");}
    else if(e.contains("marvel superheroes’ action and teamwork")){System.out.println("High-stakes battles and squad goals! From the Avengers to the Guardians, you’re all about epic collabs and saving the universe.");}
    else if(e.contains("live-action fantasy films’ musical magic")){System.out.println("You crave enchanting melodies—where Beauty and the Beast’s ballrooms or Aladdin’s rhythms make fantasy feel real!");}
    else{System.out.println("ooh, fresh Disney magic! Whether it’s Pixar’s heartwarming tales, classic villains’ schemes, or even theme park lore—you’ve got a whole new realm to explore!");}
    cs1.close();
    
    System.out.println("Who is your favourite Disney character? ");
    Scanner cs2 = new Scanner(System.in);
    String f = cs2.nextLine();
    String g = f.toLowerCase();
    if(g.contains("donald duck")){System.out.println("A classic choice! His fiery temper and big heart make every squawk-filled adventure unforgettable—plus, he’s got the best sailor outfit in Disney history!");}
    else if(g.contains("elsa")){System.out.println("Queen of ice and self-discovery! You’re drawn to her emotional depth (and that Let It Go power ballad—admit it).");}
    else if(g.contains("buzz lightyear")){System.out.println("To infinity and beyond! You love his heroic swagger and the toy-sized lessons on bravery (and humility).");}
    else{System.out.println("Ah, a Disney fan after my own heart! Whether you love the mischievous charm of a sidekick, the quiet wisdom of an unsung hero, or even a villain’s magnetic complexity—your pick reveals a spark of magic (and maybe a hint of your own personality!)");}
    cs2.close();
}
public static void Part4(){
    Scanner cs = new Scanner(System.in);
    while(true){
    String q = cs.nextLine();
    String w = q.toLowerCase();
    if (w.contains("exit"))  {
        System.out.println("Goodbye! Have a magical day!");
        break;
    }
    if(w.contains("joke")){
    String a = "Why did Mickey Mouse name his dog Pluto? Because he’s not a planet. (humornama.com)";
    String b = "How did Minnie save Mickey from drowning? Mouse to mouse resuscitation. (humornama.com)";
    String c = "What kind of car does Mickey Mouse drive? A minnie van. (punstoppable.com)";
    String d = "What do you call Mickey when he takes a break? A ‘minnie’ vacation! (punstoppable.com)";
    String e = "Why did Mickey Mouse become an astronaut? Because he wanted to visit Pluto! (punstoppable.com)";
    int r = (int)(1+5*Math.random());
        if(r == 1){System.out.println(a);}
        else if(r == 2){System.out.println(b);}
        else if(r == 3){System.out.println(c);}
        else if(r == 4){System.out.println(d);}
        else if(r == 5){System.out.println(e);}
    }
    else if(w.contains("secret")){
    String a = "Mickey Mouse's Original Name: Before settling on \"Mickey,\" Walt Disney almost named his iconic character \"Mortimer Mouse.\"";
    String b = "Ariel's Hidden Message: In The Little Mermaid, Ariel's wedding dress silhouette forms a hidden Mickey Mouse head in the bubbles.";
    String c = "Goofy's Real Identity: Goofy is actually a cow (not a dog), hinted by his original name \"Dippy Dawg\" and his bovine-like behavior in early cartoons.";
    int r = (int)(1+3*Math.random());
        if(r == 1){System.out.println(a);}
        else if(r == 2){System.out.println(b);}
        else if(r == 3){System.out.println(c);}
    }
    else{System.out.print("Sorry, please specify what you wanna hear about. You can enter \"joke\" or \"secret\".");}
    System.out.println("Wanna try another one? Or you can type in \"exit\" to end the conversation.");
    }
    cs.close();
}
}
