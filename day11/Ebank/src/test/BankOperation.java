package test;

import java.util.function.Predicate;

import exception.AccountNotFoundException;
import exception.InsufficientBalanceException;
import exception.InvalidAccountException;
import pojo.Account;

public interface BankOperation
{
    void add( Account account )throws InvalidAccountException;
    double withdraw( Account  account, double amount ) throws AccountNotFoundException,InsufficientBalanceException,InvalidAccountException;
    double deposit( Account  account, double amount ) throws AccountNotFoundException,InvalidAccountException;
    void transfer( Account src, Account dest, double amount ) throws AccountNotFoundException, InsufficientBalanceException,InvalidAccountException;
    Account remove( Account account )throws AccountNotFoundException, InvalidAccountException;
    void displayAccount( Account account )throws AccountNotFoundException, InvalidAccountException;
    void displayAllAccount( );
    Account find( Predicate<Account> p )throws AccountNotFoundException;
}