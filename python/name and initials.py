class Person:
    def __init__(self, firstName, lastName, age):
        self.firstName = firstName
        self.lastName = lastName
        self.age = age

    def full_name(self):
        return f'{self.firstName} {self.lastName}'
    def name_initials(self):
        return f'{self.firstName[0]}.{self.lastName[0]}'


person1 = Person('Davis', 'Opoku', 20)
print(person1.name_initials())