package com.example.demo.entity;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="jeri_log_22")
@FieldDefaults(level=AccessLevel.PRIVATE)
public class TransactionLog {
@Id
@Column(name="transaction_id")
int transactionId;

@Column(name="user_login_id")
int loginId;

@Column(name="api_operation_name")
String apiOperationName;

@Column(name="request")
String request;

@Column(name="response")
String response;

}
