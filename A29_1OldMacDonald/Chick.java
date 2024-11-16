class Chick
   implements Animal
{
   private String myType;
   private String mySound;
   private String mySound2;

   /**
    * Initializes a newly created Chick object so that it represents an Animal
    * of the specified type that makes the specified sound.
    * 
    * @param type
    *           the type of Chick
    * @param sound
    *           the sound the Chick makes
    */
   public Chick(String type, String sound)
   {
      myType = type;
      mySound = sound;
   }


   public Chick(String type, String sound1, String sound2)
   {
      myType = type;
      mySound = sound1;
      mySound2 = sound2;

   }


   public String getSound()
   {
      if (Math.random() < 0.5)
      {
         return mySound;
      }
      else
      {
         return mySound2;
      }
   }


   public String getType()
   {
      return myType;
   }
}
