CREATE OR REPLACE FUNCTION set_auto_id()
RETURNS TRIGGER AS $$
BEGIN

    select userid from userinfo where userid < 5500;
    if userid is null
    select max(userid) from userinfo;

END;
$$ LANGUAGE plpgsql;




# concurrent issues?
if flow_id is not null and flow_id < 5500:
    exist flow, save with flow_id directly
else:
    flow_id = select max(flow_id) + 1;
    save(flow_id)

2. 加个字段表示原来的flow ID



