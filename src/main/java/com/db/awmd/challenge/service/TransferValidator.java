package com.db.awmd.challenge.service;

import com.db.awmd.challenge.domain.Account;
import com.db.awmd.challenge.domain.TransferMoney;
import com.db.awmd.challenge.exception.AccountNotFoundException;
import com.db.awmd.challenge.exception.NotEnoughFundsException;

interface TransferValidator {

    void validate(final Account accountFrom, final Account accountTo, final TransferMoney transfer) throws AccountNotFoundException, NotEnoughFundsException;

}
