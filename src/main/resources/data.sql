drop table if exists bitscore_t_remittancerecord;

create table bitscore_t_remittancerecord (
       rr_remittance_id bigint not null,
        rr_bill_seq_number varchar(255),
        rr_payment_effective_date date,
        rr_payment_amount double,
        rr_payment_type varchar(255),
        primary key (rr_remittance_id)
    );