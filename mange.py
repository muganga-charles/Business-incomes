def salon():
    print("Salon:\n")
    daily_tax=int(input("Enter the daily tax of the room: "))
    rent=int(input("Enter the rent of the room: "))
    customers=int(input("Enter the number of customers received for a paticular day: "))
    price=int(input("enter the price of the hair cut"))
    charge=daily_tax+rent
    total_charge=price*customers
    net_income=total_charge-charge
    return net_income

def timber_business():
    print("Timber Business:\n")
    price=int(input("Enter the price of each timber: "))
    quantity=int(input("Enter the quantity of timber sold in a particular day: "))
    rent=int(input("Enter the rent of the room: "))
    daily_tax=int(input("Enter the daily tax of the room: "))
    total_price=price*quantity-(rent+daily_tax)
    return total_price

def main():
    days=int(input("Enter the number of days for this month: "))
    salon_income=salon()
    print("Salon: ",salon_income)
    Timber = timber_business()
    print("Timber Business: ",Timber)
    print("Total income for both the businesses is : ",salon_income+Timber)
    print("The total net income for both the businesses is for a given month is : ",(salon_income+Timber)/days)
main()
