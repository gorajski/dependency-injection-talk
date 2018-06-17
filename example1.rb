class Person
   @@no_of_customers = 0

   def initialize(name)
      @name = name
      @car = Car.new("Delorean")
   end

   def name
   	 @name
   end

   def car
   	 @car
   end

end