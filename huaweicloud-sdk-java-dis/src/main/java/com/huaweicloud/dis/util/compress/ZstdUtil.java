package com.huaweicloud.dis.util.compress;

import com.github.luben.zstd.Zstd;

public class ZstdUtil
{
    /**
     * @param srcByte 原始数据
     * @return 压缩后的数据
     */
    public static byte[] compressedByte(byte[] srcByte)
    {
        return Zstd.compress(srcByte);
    }
}
