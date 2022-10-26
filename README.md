# Relax_test_projects

Examples:
 --------------------------------------------
1) 
request 
{
    "path" : "D:/mag_1/relax/test/test/1.txt",
    "operation" : "get_mean_value"
}

response (json)
{
    "operationType": "mean_value",
    "result": 15.857142857142856
}

response (xml)
<OperationResponse>
    <operationType>mean_value</operationType>
    <result>15.857142857142856</result>
</OperationResponse>
 --------------------------------------------
2) 
request 
{
    "path" : "D:/mag_1/relax/test/test/1.txt",
    "operation" : "get_increasing_value"
}

response (json)
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

response (xml)
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
