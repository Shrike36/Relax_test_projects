examples
1)
request
{
    "path" : "D:/mag_1/relax/test/test/1.txt",
    "operation" : "get_increasing_sequence"
}

response (xml):
<OperationResponse>
    <operationType>increasing_sequences</operationType>
    <result>1</result>
    <result>2</result>
    <result>3</result>
    <result>4</result>
    <result>5</result>
    <result>7</result>
    <result>89</result>
</OperationResponse>

response (json):
{
    "operationType": "increasing_sequences",
    "result": [
        [
            1,
            2,
            3,
            4,
            5,
            7,
            89
        ]
    ]
}
-------------------------------------------------------------
2)
request
{
    "path" : "D:/mag_1/relax/test/test/1.txt",
    "operation" : "get_min_value"
}


response (json):
{
    "operationType": "min_value",
    "result": 1
}

response (xml):
<OperationResponse>
    <operationType>min_value</operationType>
    <result>1</result>
</OperationResponse>