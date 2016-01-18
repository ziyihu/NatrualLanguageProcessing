package com.my.assignment1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;

public class Part1f {

	public static void main(String[] args) {
		int count = 0;
		int unique = 0;
		float ratio = 0;
		LinkedHashMap<String,Integer> wordcount = new LinkedHashMap<String,Integer>();
		try{
			BufferedReader in = new BufferedReader(new FileReader("/Users/huziyi/Documents/NLP file/Assignment1/Twitter messages.txt"));
			String str;
			while((str = in.readLine())!=null){
				str = str.toLowerCase();
				String[] words = str.split("\\s+");
				for(String word:words){
					word = word.replaceAll("[^a-zA-Z]", "");
					if(word.length()==0){
						continue;
					}
					Integer number = wordcount.get(word);
					if(number == null){
						number = 1;
						unique++;
					}
					else if(number == 1){
						number++;
						unique--;
			
					}
					else{
						number++;
					}
					if(word.equals("a") || word.equals("about") || word.equals("above")
							|| word.equals("ac")|| word.equals("according")|| word.equals("accordingly")|| word.equals("across")|| word.equals("actually")|| word.equals("ad")
							|| word.equals("adj")|| word.equals("af")|| word.equals("after")|| word.equals("afterwards")
							|| word.equals("again")|| word.equals("against")|| word.equals("al")|| word.equals("albeit")
							|| word.equals("all")|| word.equals("almost")|| word.equals("alone")|| word.equals("along") 
							|| word.equals("already")|| word.equals("als")|| word.equals("also")|| word.equals("although")
					        || word.equals("always") || word.equals("am")|| word.equals("among")|| word.equals("amongst")
					        || word.equals("an")|| word.equals("and")|| word.equals("another")|| word.equals("any")
					        || word.equals("anybody")|| word.equals("anyhow")|| word.equals("anyone")|| word.equals("anything")
					        || word.equals("anyway")|| word.equals("anywhere")|| word.equals("apart")|| word.equals("apparently")
					        || word.equals("are")|| word.equals("aren")|| word.equals("arise")|| word.equals("around")
					        || word.equals("as")|| word.equals("aside")|| word.equals("at") || word.equals("au")|| word.equals("auf")
					        || word.equals("aus")|| word.equals("aux")|| word.equals("av")|| word.equals("avec")|| word.equals("away")
					        || word.equals("b")|| word.equals("be")|| word.equals("became")|| word.equals("because")|| word.equals("become")
					        || word.equals("becomes")|| word.equals("becoming")|| word.equals("been")|| word.equals("before")|| word.equals("beforehand")
					        || word.equals("began")|| word.equals("begin")|| word.equals("beginning")|| word.equals("begins")|| word.equals("behind")
					        || word.equals("bei")|| word.equals("being")|| word.equals("below")|| word.equals("beside")|| word.equals("besides") 
					        || word.equals("best")|| word.equals("better")|| word.equals("between")|| word.equals("beyond")|| word.equals("billion")
					        || word.equals("both")|| word.equals("briefly")|| word.equals("but")|| word.equals("by")|| word.equals("c")
					        || word.equals("came")|| word.equals("can")|| word.equals("cannot")|| word.equals("canst")|| word.equals("captions")
					        || word.equals("certain")|| word.equals("certainly")|| word.equals("cf")|| word.equals("choose")
					        || word.equals("chooses")|| word.equals("choosing")|| word.equals("chose")|| word.equals("chosen")
					        || word.equals("clear")|| word.equals("clearly")|| word.equals("co")|| word.equals("come")|| word.equals("comes")
					        || word.equals("con")|| word.equals("contrariwise")|| word.equals("cos")|| word.equals("could")|| word.equals("couldn") 
					        || word.equals("cu")|| word.equals("d")|| word.equals("da")|| word.equals("dans")|| word.equals("das")|| word.equals("day")
					        || word.equals("de")|| word.equals("degli")|| word.equals("dei")|| word.equals("del")|| word.equals("delle")
					        || word.equals("dem")|| word.equals("den")|| word.equals("der")|| word.equals("deren")|| word.equals("des")
					        || word.equals("di")|| word.equals("did")|| word.equals("didn")|| word.equals("die")|| word.equals("different")
					        || word.equals("din")|| word.equals("do")|| word.equals("does")|| word.equals("doesn")|| word.equals("doing")
					        || word.equals("don")|| word.equals("done")|| word.equals("dos")|| word.equals("double")|| word.equals("down")
					        || word.equals("du")|| word.equals("dual")|| word.equals("due")|| word.equals("durch")|| word.equals("during")
					        || word.equals("e")|| word.equals("each")|| word.equals("ed")|| word.equals("eg")|| word.equals("eight")|| word.equals("eighty")
					        || word.equals("either")|| word.equals("el")|| word.equals("else")|| word.equals("elsewhere")|| word.equals("em")|| word.equals("en")
					        || word.equals("end")|| word.equals("ended")|| word.equals("ending")|| word.equals("ends")|| word.equals("enough")|| word.equals("es")
					        || word.equals("especially")|| word.equals("et")|| word.equals("etc")|| word.equals("even")|| word.equals("ever")|| word.equals("every")
					        || word.equals("everybody")|| word.equals("everyone")|| word.equals("everything")|| word.equals("everywhere")|| word.equals("except")
					        || word.equals("excepts")|| word.equals("excepted")|| word.equals("excepting")|| word.equals("exception")|| word.equals("exclude")|| word.equals("excluded")
					        || word.equals("excludes")|| word.equals("excluding")|| word.equals("exclusive")|| word.equals("f")|| word.equals("fact")
					        || word.equals("facts")|| word.equals("far")|| word.equals("farther")|| word.equals("farthest")|| word.equals("few")|| word.equals("ff")
					        || word.equals("fifty")|| word.equals("finally")|| word.equals("first")|| word.equals("five")|| word.equals("foer")|| word.equals("follows")
					        || word.equals("following")|| word.equals("for")|| word.equals("former")|| word.equals("formerly")|| word.equals("forth")|| word.equals("forty")
					        || word.equals("forward")|| word.equals("found")|| word.equals("four")|| word.equals("fra")|| word.equals("frequently")
					        || word.equals("from")|| word.equals("front")|| word.equals("fuer")|| word.equals("further")|| word.equals("furthermore")
					        || word.equals("furthest")|| word.equals("g")|| word.equals("gave")|| word.equals("general")|| word.equals("generally")|| word.equals("get")
					        || word.equals("gets")|| word.equals("getting")|| word.equals("give")|| word.equals("gives")|| word.equals("giving")|| word.equals("go")
					        || word.equals("going")|| word.equals("gone")|| word.equals("good")|| word.equals("got")|| word.equals("great")|| word.equals("greater")
					        || word.equals("h")|| word.equals("had")|| word.equals("haedly")|| word.equals("has")|| word.equals("hasn")|| word.equals("hast")
					        || word.equals("hath")|| word.equals("have")|| word.equals("haven")|| word.equals("having")|| word.equals("he")|| word.equals("hence")
					        || word.equals("henceforth")|| word.equals("her")|| word.equals("hereabouts")|| word.equals("hereafter")|| word.equals("hereby")|| word.equals("herein")
					        || word.equals("hereto")|| word.equals("had")|| word.equals("haedly")|| word.equals("half")|| word.equals("halves")|| word.equals("hereupon")
					        || word.equals("hers")|| word.equals("herself")|| word.equals("het")|| word.equals("high")|| word.equals("higher")|| word.equals("highest")
					        || word.equals("him")|| word.equals("himself")|| word.equals("hindmost")|| word.equals("his")|| word.equals("hither")|| word.equals("how")
					        || word.equals("however")|| word.equals("howsoever")|| word.equals("hundred")|| word.equals("hundreds")|| word.equals("i")|| word.equals("ie")
					        || word.equals("if")|| word.equals("ihre")|| word.equals("ii")|| word.equals("im")|| word.equals("immediately")|| word.equals("important")
					        || word.equals("in")|| word.equals("inasmuch")|| word.equals("inc")|| word.equals("include")|| word.equals("includes")|| word.equals("including")
					        || word.equals("indeed")|| word.equals("indoors")|| word.equals("inside")|| word.equals("insomuch")|| word.equals("instead")|| word.equals("into")
					        || word.equals("inward")|| word.equals("is")|| word.equals("isn")|| word.equals("it")|| word.equals("its")|| word.equals("itself")
					        || word.equals("j")|| word.equals("ja")|| word.equals("journal")|| word.equals("journals")|| word.equals("just")
					        || word.equals("k")|| word.equals("kai")|| word.equals("keep")|| word.equals("keeping")|| word.equals("kept")
					        || word.equals("kg")|| word.equals("kind")|| word.equals("kinds")|| word.equals("km")
					        || word.equals("l")|| word.equals("la")|| word.equals("large")|| word.equals("largely")
							|| word.equals("largest")|| word.equals("las")|| word.equals("last")|| word.equals("latter")
							|| word.equals("latterly")|| word.equals("le")|| word.equals("least")|| word.equals("lest")
							|| word.equals("let")|| word.equals("like")|| word.equals("likely")|| word.equals("little")|| word.equals("ll")
							|| word.equals("long")|| word.equals("longer")|| word.equals("los")|| word.equals("low")|| word.equals("lower")
							|| word.equals("lowest")|| word.equals("ltd")|| word.equals("m")|| word.equals("made")|| word.equals("mainly")
							|| word.equals("make")|| word.equals("makes")|| word.equals("making")|| word.equals("many")|| word.equals("may")
							|| word.equals("maybe")|| word.equals("me")|| word.equals("meantime")|| word.equals("meanwhile")|| word.equals("med")
							|| word.equals("might")|| word.equals("million")|| word.equals("mine")|| word.equals("miss")|| word.equals("mit")
							|| word.equals("more")|| word.equals("moreover")|| word.equals("most")|| word.equals("mostyly")|| word.equals("mr")
							|| word.equals("mrs")|| word.equals("ms")|| word.equals("much")|| word.equals("mug")|| word.equals("must")
							|| word.equals("my")|| word.equals("myself")|| word.equals("n")|| word.equals("na")|| word.equals("nach")
							|| word.equals("namely")|| word.equals("nas")|| word.equals("near")|| word.equals("nearly")|| word.equals("necessay")
							|| word.equals("need")|| word.equals("needed")|| word.equals("needing")|| word.equals("neither")|| word.equals("nel")
							|| word.equals("nella")|| word.equals("never")|| word.equals("nevertheless")|| word.equals("new")|| word.equals("next")
							|| word.equals("nine")|| word.equals("ninety")|| word.equals("no")|| word.equals("nobody")|| word.equals("none")
							|| word.equals("nonetheless")|| word.equals("noone")|| word.equals("nope")|| word.equals("nor")|| word.equals("nos")
							|| word.equals("not")|| word.equals("note")|| word.equals("noted")|| word.equals("notes")|| word.equals("noting")
							|| word.equals("nothing")|| word.equals("notwithstandong")|| word.equals("now")|| word.equals("nowadays")
							|| word.equals("nowhere")|| word.equals("o")|| word.equals("obtain")|| word.equals("obtained")|| word.equals("obtaining")
							|| word.equals("obtains")|| word.equals("och")|| word.equals("of")|| word.equals("off")|| word.equals("often")|| word.equals("og")
							|| word.equals("ohne")|| word.equals("ok")|| word.equals("old")|| word.equals("om")|| word.equals("on")|| word.equals("once")
							|| word.equals("onceone")|| word.equals("one")|| word.equals("only")|| word.equals("onto")|| word.equals("or")|| word.equals("ot")
							|| word.equals("other")|| word.equals("others")|| word.equals("otherwise")|| word.equals("ou")|| word.equals("ought")
							|| word.equals("our")|| word.equals("ours")|| word.equals("ourselves")|| word.equals("out")|| word.equals("outside")
							|| word.equals("over")|| word.equals("overall")|| word.equals("owing")|| word.equals("own")
							|| word.equals("p")|| word.equals("par")|| word.equals("para")|| word.equals("particular")
							|| word.equals("particularly")|| word.equals("past")|| word.equals("per")|| word.equals("perhaps")|| word.equals("please")
							|| word.equals("plenty")|| word.equals("plus")|| word.equals("por")|| word.equals("possible")|| word.equals("possibly")
							|| word.equals("pour")|| word.equals("poured")|| word.equals("pouring")|| word.equals("pours")
							|| word.equals("predominantly")|| word.equals("previously")|| word.equals("pro")|| word.equals("probably")|| word.equals("prompt")
							|| word.equals("promptly")|| word.equals("provide")|| word.equals("provides")|| word.equals("provided")|| word.equals("providing")
							|| word.equals("q")|| word.equals("quite")
							|| word.equals("r")|| word.equals("rather")|| word.equals("re")|| word.equals("ready")|| word.equals("really")
							|| word.equals("recent")|| word.equals("recnently")|| word.equals("regardless")|| word.equals("relatively")|| word.equals("respectively")
							|| word.equals("round")|| word.equals("s")|| word.equals("said")|| word.equals("same")|| word.equals("sang")
							|| word.equals("save")|| word.equals("saw")|| word.equals("say")|| word.equals("second")|| word.equals("see")
							|| word.equals("seeing")|| word.equals("seem")|| word.equals("seemed")|| word.equals("seeming")|| word.equals("seems")|| word.equals("seen")
							|| word.equals("sees")|| word.equals("seldom")|| word.equals("self")|| word.equals("selves")|| word.equals("send")|| word.equals("sending")
							|| word.equals("sends")|| word.equals("sent")|| word.equals("ses")|| word.equals("seven")|| word.equals("seventh")
							|| word.equals("several")|| word.equals("shall")|| word.equals("shalt")|| word.equals("she")
							|| word.equals("short")|| word.equals("should")|| word.equals("shouldn")|| word.equals("show")|| word.equals("showed")
							|| word.equals("showing")|| word.equals("shown")|| word.equals("shows")|| word.equals("si")|| word.equals("sideways")
							|| word.equals("significant")|| word.equals("similar")|| word.equals("similarly")|| word.equals("simply")|| word.equals("since")
							|| word.equals("sing")|| word.equals("single")|| word.equals("six")|| word.equals("sixty")
							|| word.equals("sleep")|| word.equals("sleeping")|| word.equals("sleeps")|| word.equals("slept")
							|| word.equals("slew")|| word.equals("slightly")|| word.equals("small")|| word.equals("smote")
							|| word.equals("so")|| word.equals("sobre")|| word.equals("some")|| word.equals("somebody")|| word.equals("somehow")
							|| word.equals("someone")|| word.equals("something")|| word.equals("sometime")|| word.equals("sometimes")
							|| word.equals("somewhat")|| word.equals("somewhere")|| word.equals("son")|| word.equals("spake")
							|| word.equals("spat")|| word.equals("speek")|| word.equals("speeks")|| word.equals("spit")|| word.equals("spits")
							|| word.equals("spitting")|| word.equals("spoke")|| word.equals("spoken")|| word.equals("sprang")
							|| word.equals("sprung")|| word.equals("staves")|| word.equals("still")|| word.equals("stop")|| word.equals("strongly")
							|| word.equals("substantially")|| word.equals("successfully")|| word.equals("such")|| word.equals("sui")
							|| word.equals("sulla")|| word.equals("sung")|| word.equals("supposing")|| word.equals("sur")|| word.equals("t")
							|| word.equals("take")|| word.equals("taken")|| word.equals("takes")|| word.equals("taking")|| word.equals("te")
							|| word.equals("ten")|| word.equals("tes")|| word.equals("than")|| word.equals("that")|| word.equals("the")
							|| word.equals("thee")|| word.equals("their")|| word.equals("theirs")|| word.equals("them")
							|| word.equals("themselves")|| word.equals("then")|| word.equals("thence")|| word.equals("thenceforth")
							|| word.equals("there")|| word.equals("thereabout")|| word.equals("thereabouts")|| word.equals("thereafter")
							|| word.equals("thereby")|| word.equals("therefor")|| word.equals("therein")|| word.equals("thereof")
							|| word.equals("thereon")|| word.equals("thereto")|| word.equals("thereupon")|| word.equals("these")|| word.equals("they")|| word.equals("thing")
							|| word.equals("things")|| word.equals("third")|| word.equals("thirty")|| word.equals("this")|| word.equals("those")|| word.equals("thou")
							|| word.equals("tough")|| word.equals("thousand")|| word.equals("thousands")|| word.equals("three")
							|| word.equals("thrice")|| word.equals("through")|| word.equals("throughout")|| word.equals("thru")|| word.equals("thus")|| word.equals("thy")
							|| word.equals("thyself")|| word.equals("til")|| word.equals("till")|| word.equals("time")|| word.equals("times")|| word.equals("tis")|| word.equals("to")
							|| word.equals("together")|| word.equals("too")|| word.equals("tot")|| word.equals("tou")|| word.equals("toward")|| word.equals("towards")
							|| word.equals("trillion")|| word.equals("trillions")|| word.equals("twenty")|| word.equals("two")|| word.equals("u")
							|| word.equals("ueber")|| word.equals("ugh")|| word.equals("uit")|| word.equals("un")|| word.equals("unable")|| word.equals("und")
							|| word.equals("under")|| word.equals("underneath")|| word.equals("unless")|| word.equals("unlike")|| word.equals("unlikely")
							|| word.equals("until")|| word.equals("up")|| word.equals("upon")|| word.equals("upward")|| word.equals("us")|| word.equals("use")
							|| word.equals("used")|| word.equals("useful")|| word.equals("usefully")|| word.equals("user")|| word.equals("users")|| word.equals("uses")
							|| word.equals("using")|| word.equals("usually")|| word.equals("v")|| word.equals("van")|| word.equals("various")|| word.equals("ve")
							|| word.equals("very")|| word.equals("via")|| word.equals("vom")|| word.equals("von")|| word.equals("voor")|| word.equals("vs")
							|| word.equals("want")|| word.equals("was")|| word.equals("wasn")|| word.equals("way")|| word.equals("we")|| word.equals("week")
							|| word.equals("weeks")|| word.equals("well")|| word.equals("went")|| word.equals("were")|| word.equals("weren")|| word.equals("what")
							|| word.equals("whatever")|| word.equals("whatsoever")|| word.equals("when")|| word.equals("whence")|| word.equals("whenever")|| word.equals("whensoever")
							|| word.equals("where")|| word.equals("whereabouts")|| word.equals("whereafter")|| word.equals("whereas")|| word.equals("whereby")|| word.equals("whereat")
							|| word.equals("wherefore")|| word.equals("wherefrom")|| word.equals("wherein")|| word.equals("whereinto")|| word.equals("whereof")|| word.equals("whereon")
							|| word.equals("wheresoever")|| word.equals("whereto")|| word.equals("whereunto")|| word.equals("whereupon")|| word.equals("wherever")|| word.equals("wherewith")
							|| word.equals("whether")|| word.equals("when")|| word.equals("which")|| word.equals("whichever")|| word.equals("whichsoever")
							|| word.equals("while")|| word.equals("whilst")|| word.equals("whither")|| word.equals("who")|| word.equals("whoever")|| word.equals("whole")
							|| word.equals("whom")|| word.equals("whomever")|| word.equals("whomsoever")|| word.equals("why")|| word.equals("wide")|| word.equals("widely")
							|| word.equals("will")|| word.equals("wilt")|| word.equals("with")|| word.equals("within")|| word.equals("without")|| word.equals("won")|| word.equals("worse")
							|| word.equals("worst")|| word.equals("would")|| word.equals("wouldn")
							|| word.equals("wow")|| word.equals("x")|| word.equals("xauthor")|| word.equals("xcal")|| word.equals("xnote")
							|| word.equals("xother")|| word.equals("xsubj")|| word.equals("y")|| word.equals("ye")|| word.equals("year")
							|| word.equals("yes")|| word.equals("yet")|| word.equals("yipee")|| word.equals("you")|| word.equals("your")|| word.equals("yours")
							|| word.equals("yourself")|| word.equals("yourselves")|| word.equals("yu")|| word.equals("z")
							|| word.equals("za")|| word.equals("ze")|| word.equals("zu")|| word.equals("zum"))
							
					{	
					}else{
						wordcount.put(word, number);
						count++;
					}
				}
				
			}
			ratio = (float)(unique)/(float)(count);
			System.out.println("the total number of word:"+count);
			System.out.println("the unique number of word:"+unique);
			System.out.println("the ratio is:"+ratio);
	
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		   ArrayList<Integer> values = new ArrayList<Integer>();
		    values.addAll(wordcount.values());

		    Collections.sort(values, Collections.reverseOrder());

		    int last_i = -1;

		    for (Integer i : values.subList(0, 99)) { 
		        if (last_i == i) 
		            continue;
		        last_i = i;




		            for (String s : wordcount.keySet()) { 

		            if (wordcount.get(s) == i)
		            
		            	System.out.println(s+ " " + i);

		            }
		    
			}
	}

}
