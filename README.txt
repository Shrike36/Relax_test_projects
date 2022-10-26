RESULTS OF 10m.txt:
1) min -49999996
2) max 49999978
3) median 25216
4) mean 7364.418442641056
5) increasing
        -48190694,
        -47725447,
        -43038241,
        -20190291,
        -17190728,
        -6172572,
        8475960,
        25205909,
        48332507,
        48676185
6) decreasing
        47689379,
        42381213,
        30043880,
        12102356,
        -4774057,
        -5157723,
        -11217378,
        -23005285,
        -23016933,
        -39209115,
        -49148762

------------------------------------------------------------------
EXAMPLES
1)
REQUEST
{
    "path" : "D:/mag_1/relax/test/test/1.txt",
    "operation" : "get_increasing_sequence"
}

RESPONSE (xml):
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

RESPONSE (json):
{
    "operationType": "increasing_sequences",
    "result": [
        [1, 2, 3, 4, 5, 7, 89]
    ]
}

-------------------------------------------------------------
2)
REQUEST
{
    "path" : "D:/mag_1/relax/test/test/1.txt",
    "operation" : "get_min_value"
}


RESPONSE (json):
{
    "operationType": "min_value",
    "result": 1
}

RESPONSE (xml):
<OperationResponse>
    <operationType>min_value</operationType>
    <result>1</result>
</OperationResponse>

-----------------------------------------------------------------
3)
REQUEST
{
    "path" : "D:/mag_1/relax/test/test/1.txt",
    "operation" : "get_increasing_sequence"
}

RESPONSE (json):
{
    "operationType": "increasing_sequences",
    "result": [
        [ 1, 3, 7 ],
        [ 1, 2, 3 ]
    ]
}

RESPONSE (xml):
<OperationResponse>
    <operationType>increasing_sequences</operationType>
    <result>1</result>
    <result>3</result>
    <result>7</result>
    <result>1</result>
    <result>2</result>
    <result>3</result>
</OperationResponse>
