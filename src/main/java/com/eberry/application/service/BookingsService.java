package com.eberry.application.service;


import com.eberry.application.dto.ResponseData;
import com.eberry.application.dto.TransactionDetails;
import com.eberry.application.dto.TransactionDetailsRequest;
import com.eberry.application.dto.TransactionsRequest;
import reactor.core.publisher.Flux;

public interface BookingsService {

  /**
   * This service returns rejected transaction details where details are received in string format
   *
   * @return
   */
  public Flux<TransactionDetails> rejectedTransactionDetails(
      TransactionDetailsRequest transactionDetailsRequest);

  /**
   * This service returns rejected transaction details where details are received in string format
   *
   * @return
   */
  public ResponseData rejectedTransactionDetailsAsList(
      TransactionDetailsRequest transactionDetailsRequest);

  /**
   * This service returns rejected transaction details where details are received in json object
   * format
   *
   * @return
   */
  public Flux<TransactionDetails> rejectedTransactionDetailsObjectFormat(
      TransactionsRequest transactionsRequest);

  /**
   * hard coded sample data
   *
   * @return
   */
  public Flux<TransactionDetails> rejectedTransactionDetailsWithDataHardCoding();
}
