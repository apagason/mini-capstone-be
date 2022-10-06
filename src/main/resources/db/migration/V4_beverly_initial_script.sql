DROP SCHEMA IF EXISTS beverly cascade;
CREATE SCHEMA beverly;

CREATE TABLE beverly.todolist (
            todo_id uuid,
            todo varchar(300),
            created_date TIMESTAMP WITH TIME ZONE,
            modified_date TIMESTAMP WITH TIME ZONE,
            PRIMARY KEY (todo_id)
);