## A class is a blue-print for creating objects.
##class BakingPan:
#   def __init__(self, flour, sugar, special_ingredient):
##     self.flour = flour
##    self.sugar = sugar
##   self.special_ingredient = special_ingredient

#bread1 = BakingPan('soft', 20, 'wheat')
#bread2 = BakingPan('hard', 15, 'banana')
#print(bread2.special_ingredient)

# accessing a global variable
#school = 'KNUST'
#class BakingPan:
#    department = 'Computer Science Department'
#    def __init__(self, flour, sugar, special_ingredient):
#        self.flour = flour
#        self.sugar = sugar
#        self.special_ingredient = special_ingredient

#bread1 = BakingPan('soft', 20, 'wheat')
#print(BakingPan.department)

#class BakingPan:
#    unit_price = 5
#    def __init__(self, flour, sugar, special_ingredient):
#        self.flour = flour
#        self.sugar = sugar
#        self.special_ingredient = special_ingredient

#    def bread_name(self):
#       return f'{self.special_ingredient}bread'
#bread1 = BakingPan('soft', 20, 'wheat')
#bread2 = BakingPan('hard', 15, 'coconut')
#print(bread1.bread_name())
#print(bread2.bread_name())
class BakingPan:
    unit_price = 5
    def __init__(self, flour, sugar, special_ingredient):
        self.flour = flour
        self.sugar = sugar
        self.special_ingredient = special_ingredient

    def bread_name(self):
       return f'{self.special_ingredient}bread'
    def total_price(self,quantity):
        total = quantity * self.unit_price
        return f'Total price of {quantity} {self.bread_name()} = Ghc{total}'

bread1 = BakingPan('soft', 20, 'wheat')
bread2 = BakingPan('hard', 15, 'coconut')
print(bread1.total_price(10))
print(bread2.total_price(25))
