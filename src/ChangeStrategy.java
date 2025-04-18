// Interface for Strategy Pattern

public interface ChangeStrategy
{
    Purse makeChange(double amount, Denomination[] currency);
}
