class Horse

   def initialize(id,breed,age)
     @id = id
     @jockey = jockey
     @breed = breed
     @age = age
     @speed = 0
   end

   def trot
      @speed = 30
   end

   def run
      @speed = 100
   end

   def stop
      @speed = 0
   end

end



class Jockey

   def initialize(id,name,height)
      @id = id
      @name = name
   end

}