INSERT INTO wallet.clients (id, name, email, created_at) VALUES ('f49f62b2-b795-407e-96f5-0755570192d8', 'Maria', 'maria@gmail.com', CURRENT_DATE);
INSERT INTO wallet.clients (id, name, email, created_at) VALUES ('f70b297a-1ea0-48ed-89b8-062611d388d3', 'João', 'joao@gmail.com', CURRENT_DATE);

INSERT INTO wallet.accounts (id, client_id, balance, created_at) VALUES ('408ee314-bc5f-43c1-9968-e7aaf014c95c', 'f49f62b2-b795-407e-96f5-0755570192d8', 1000, CURRENT_DATE);
INSERT INTO wallet.accounts (id, client_id, balance, created_at) VALUES ('8e7376fb-7d89-431a-bfec-b5ce351aa64d', 'f70b297a-1ea0-48ed-89b8-062611d388d3', 1000, CURRENT_DATE);

INSERT INTO balance.balances (account_id, amount, created_at) VALUES ('408ee314-bc5f-43c1-9968-e7aaf014c95c', 1000, CURRENT_TIMESTAMP);
INSERT INTO balance.balances (account_id, amount, created_at) VALUES ('8e7376fb-7d89-431a-bfec-b5ce351aa64d', 1000, CURRENT_TIMESTAMP);