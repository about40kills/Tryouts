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
