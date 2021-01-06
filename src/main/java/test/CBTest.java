package test;

import com.couchbase.client.java.Bucket;
import com.couchbase.client.java.CouchbaseCluster;
import com.couchbase.client.java.document.ByteArrayDocument;
import com.couchbase.client.java.document.JsonDocument;
import com.google.protobuf.InvalidProtocolBufferException;

import java.util.Arrays;
import java.util.List;

public class CBTest {

    private static Bucket cbBucket;

    private static void initBucket() {
        String host = "http://bddd.public281-bddd.1.qiyi.cb:8091,http://bddd.public281-bddd.2.qiyi.cb:8091";
        String bucketName = "comment_realtime_slice_invert";
        String password = "2!q!GVZC";
        List<String> nodes = Arrays.asList(host.split(","));
        CouchbaseCluster cluster = CouchbaseCluster.create(nodes);
        cbBucket = cluster.openBucket(bucketName, password);
    }

    public static void main(String[] args) throws InvalidProtocolBufferException {
        initBucket();
        ByteArrayDocument tbf_4669106587380229 = cbBucket.get(ByteArrayDocument.create("tbf_4669106587380229"));
        TopicSchemaV2.TopicFeature topicFeature = TopicSchemaV2.TopicFeature.parseFrom(tbf_4669106587380229.content());

        System.out.println();
    }
}
