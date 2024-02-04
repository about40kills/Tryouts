from time import sleep


class BakingPan:
    unit_price = 5

    def __init__(self, flour, sugar: int, special_ingredient):
        self.flour = flour
        self.sugar = sugar
        self.special_ingredient = special_ingredient

    def __str__(self):  
        return f'Flour used:{self.flour}\n Cups of sugar used: {self.sugar}\n ' \
               f'Special ingredient used: {self.special_ingredient}'


class BakingPan2(BakingPan):
    def __init__(self, flour, sugar: int, special_ingredient,
                 ordered=None):
        super().__init__(flour, sugar, special_ingredient)
        if ordered is None:
            ordered = []
            self.ordered = ordered

    def view(self):
        for i in self.ordered:
            if i in self.ordered:
                print(f'{i} in order')
            else:
                print('No orders')

    def adding_orders(self, flour, sugar: int, special_ingredient):
        order_details = {
            'Flour': flour,
            'Sugar': sugar,
            'Special Ingredient': special_ingredient
        }
        self.ordered.append(order_details)

        # self.ordered.append(flour)
        # self.ordered.append(sugar)
        # self.ordered.append(special_ingredient)

    def bread_name(self):
        for order in self.ordered:
            special_ingredient = order.get("Special Ingredient", "None")
            print(f'{special_ingredient} bread')

            # return f'{self.special_ingredient} bread'

    def total_price(self, quantity: int):
        total = quantity * self.unit_price
        print(f'Total price of {quantity} {self.bread_name()}(s) = GHC{total}.00')


class Order:
    def __init__(self):
        self.ordering = BakingPan2('None', 0, 'None')

    def homepage(self):
        print('*****Customer List*****')
        print('1.Place Order')
        print('2. View Price')
        print('3. View Orders')
        print('4. Bread Order')
        print('5. Quit Application')
        sleep(2)
        choice = input('Enter number: ')

        if choice == '1':
            self.order() 
        elif choice == '2':
            self.view_prices()
        elif choice == '3':
            self.view_orders()
        elif choice == '4':
            self.bread_orders()
        elif choice == '5':
            print('Application closing...')
            sleep(2)
            print("App closed")
            exit()
        else:
            print('Wrong Input')
        sleep(1)
        self.homepage()

    def order(self):  
        sleep(1)
        flour_type = input('Enter flour type: ')
        flour_type = flour_type.title()
        sugar_num = int(input(f'Enter number of cups of sugar used '))
        special_ing = input('Enter special ingredient used(if any) ')
        special_ing = special_ing.title()
        self.ordering.adding_orders(flour_type, sugar_num, special_ing)  

    def view_prices(self):
        pricing = int(input('Enter quantity: '))
        self.ordering.total_price(pricing)

    def bread_orders(self):
        self.ordering.bread_name()

    def view_orders(self):  
        self.ordering.view()


app = Order()
if __name__ == "__main__":
    app.homepage()