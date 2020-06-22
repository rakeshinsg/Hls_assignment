CREATE TABLE USER_REQUEST (
  request_id VARCHAR(32) PRIMARY KEY,
  submitted_by VARCHAR(10) NOT NULL,
  submitted_date date NOT NULL,
  approved_by VARCHAR(10),
  approval_date date,
  status VARCHAR(10) NOT NULL,
  account_number VARCHAR(20) NOT NULL
);