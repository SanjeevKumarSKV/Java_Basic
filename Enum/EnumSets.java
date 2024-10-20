import java.util.EnumSet;
enum animals{
				TIGER,
				LION,
				DOG,
				CAT;
			
				static final EnumSet<animals> Domesticanimals = EnumSet.of(DOG,CAT);
				static final EnumSet<animals> Wildanimals = EnumSet.of(TIGER,LION);
				
			}
			
public class EnumSets{
				public static void main(String args[]){
					animals animal1 = animals.TIGER ;
					if(animals.Domesticanimals.contains(animal1)){
						System.out.println("  DOMESTIC ANIMALS ");
					}
					else if(animals.Wildanimals.contains(animal1)){
						System.out.println(" WILD ANIMALS ");
					}
				}
			}
			