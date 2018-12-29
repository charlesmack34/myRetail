-- Table: product.product_price

-- DROP TABLE product.product_price;

CREATE TABLE product.product_price
(
    product_id integer NOT NULL,
    price numeric(8,2) NOT NULL,
    create_dttm timestamp with time zone NOT NULL DEFAULT now(),
    update_dttm timestamp with time zone NOT NULL DEFAULT now(),
    CONSTRAINT product_price_pkey PRIMARY KEY (product_id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE product.product_price
    OWNER to postgres;

GRANT ALL ON TABLE product.product_price TO postgres;

GRANT ALL ON TABLE product.product_price TO PUBLIC;

COMMENT ON TABLE product.product_price
    IS 'Red Sky Product price information.';

COMMENT ON COLUMN product.product_price.create_dttm
    IS 'Created Date & Time';

COMMENT ON COLUMN product.product_price.update_dttm
    IS 'Updated Date & Time';

CREATE USER demo WITH ENCRYPTED PASSWORD 'admin';