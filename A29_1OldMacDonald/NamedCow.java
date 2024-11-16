class NamedCow
   extends Cow
{
   private String myName;

   public NamedCow(String type, String name, String sound)
   {
      super(type, sound);
      myName = name;
   }


   public NamedCow(String name, String sound)
   {
      super("cow", sound);
      myName = name;
   }


   public String getName()
   {
      return myName;
   }
}
