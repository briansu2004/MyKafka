# My Kafka

## My Kafka projects

### Project 1

<!-- 
Built a Java Spring Boot and Kafka application for a bank client.

- Defined the business requirements with the product owners.
- Designed the application on these criteria: data source identification, data model categorization, Kafka topic schema designs, Kafka partition strategy, retention policy choosing, replica factor definition, scalability planning etc.
- Set up the Kafka cluster with Confluent Cloud.
- Developed the microservices and then implemented the Kafka producers and consumers with Java Spring Boot.
- Tested the microservices with Postman and curl.
- Deployed the microservices to Google Cloud with Docker and Kubernetes.

==> -->

Built a Java Spring Boot and Kafka application for a bank client.

- Defined business requirements in collaboration with product owners to ensure alignment with project goals.
- Designed the application architecture, focusing on key criteria including data source identification, data model categorization, Kafka topic schema design, partition strategy, retention policy selection, replica factor definition, and scalability planning.
- Set up the Kafka cluster using Confluent Cloud to ensure reliable and scalable data streaming infrastructure.
- Developed microservices with Java Spring Boot and implemented Kafka producers and consumers to facilitate seamless data processing.
- Conducted comprehensive testing of microservices using Postman and curl to validate functionality and performance.
- Deployed microservices to Google Cloud Platform using Docker and Kubernetes, ensuring a robust and scalable deployment pipeline.
- Leveraged Kafka's capabilities to handle real-time data streaming and processing, enhancing the bank's data management and processing capabilities.

## Info

[What is Kafka](WhatIsKafka/README.md)

[Install Kafka On Windows](InstallKafkaOnWindows/README.md)

[Kafka for Microservice](Kafka_Microservice.md)

## How to add Kafka in AWS or Azure or GCP?

You can add Kafka to AWS, Azure, or GCP using several options depending on whether you want to manage the Kafka cluster yourself, use a managed service, or integrate with a Confluent Cloud offering. Below is a guide on how to deploy Kafka in each of the major cloud platforms:

---

## **1. Deploying Kafka on AWS:**

### **Option 1: Use Amazon MSK (Managed Streaming for Apache Kafka)**

1. **Create an MSK Cluster:**
   - Go to the **Amazon MSK Console**.
   - Click **Create Cluster**.
   - Choose a **Cluster Name** and set **broker configurations** (e.g., instance types, number of brokers).
   - Configure the **networking settings** (VPC, subnets, security groups).
   - Define **storage settings** and **monitoring options**.
   - Launch the cluster and wait until it’s in an **Active** state.

2. **Connect to the MSK Cluster:**
   - Use a client such as **Kafka Console Producer/Consumer** to connect.
   - Use the **bootstrap servers** provided in the MSK configuration to send and receive messages.

3. **Add Authentication & Authorization:**
   - Use **IAM** or **SASL/SCRAM** for Kafka client authentication.
   - Set up **Kafka ACLs** for topic-level authorization.

### **Option 2: Set Up Kafka on EC2 Instances**

1. **Launch EC2 instances** with the desired instance type and operating system.
2. **Install Kafka** on each EC2 instance manually or using configuration management tools like **Ansible** or **Chef**.
3. Configure **Kafka brokers**, **Zookeeper** nodes, and **network settings**.
4. Deploy **Kafka Manager** or another monitoring tool to manage the cluster.

### **Option 3: Use Confluent Cloud**

1. **Create a Confluent Cloud Account**.
2. Deploy a **Kafka Cluster** in the desired **AWS region**.
3. Integrate with **AWS services** such as Lambda, S3, or Redshift for data processing.

---

## **2. Deploying Kafka on Azure:**

### **Option 1: Use Azure Event Hubs for Kafka (Managed Kafka Service)**

1. **Create an Azure Event Hub Namespace:**
   - Go to the **Azure Portal** and create an **Event Hub Namespace**.
   - Enable the **Kafka protocol** in the namespace settings.

2. **Create an Event Hub (Equivalent to a Kafka Topic):**
   - Inside the namespace, create an **Event Hub** for Kafka producers and consumers.

3. **Connect Kafka Applications:**
   - Use the **Kafka-compatible endpoint** provided by Azure.
   - Point your **Kafka clients** to the Event Hub namespace with the **Kafka protocol** enabled.

### **Option 2: Set Up Kafka on Azure Virtual Machines (VMs)**

1. **Create Virtual Machines** for each Kafka broker and Zookeeper node.
2. Install **Kafka and Zookeeper** on the VMs.
3. Configure **Kafka broker properties**, **Zookeeper nodes**, and **networking**.
4. Use **Azure Load Balancer** for scaling and **Azure Disk Storage** for data storage.

### **Option 3: Use Confluent Cloud on Azure**

1. **Create a Confluent Cloud Account**.
2. Choose **Azure** as the cloud provider and deploy a Kafka cluster in the desired **Azure region**.
3. Integrate Kafka with **Azure services** like **Azure Functions** or **Azure Blob Storage**.

---

## **3. Deploying Kafka on Google Cloud Platform (GCP):**

### **Option 1: Use Confluent Cloud for Kafka**

1. **Create a Confluent Cloud Account**.
2. Choose **Google Cloud** as the cloud provider and select a **GCP region**.
3. Launch a **Kafka cluster**.
4. Configure **client credentials** and connect **Kafka producers and consumers**.

### **Option 2: Set Up Kafka on GCP Compute Engine**

1. **Launch GCP Compute Engine instances** for each Kafka broker and Zookeeper node.
2. Install **Kafka and Zookeeper** on each instance.
3. Configure **Kafka broker properties** and **Zookeeper nodes**.
4. Use **GCP internal load balancer** for high availability and **persistent disks** for storage.

### **Option 3: Use Google Cloud Pub/Sub as a Kafka Alternative**

1. Create a **Google Cloud Pub/Sub** topic, which serves as an alternative to Kafka topics.
2. Use **Kafka Connect** or **Google Cloud connectors** to integrate existing Kafka applications with Pub/Sub.
3. Use **Google Cloud Dataflow** for real-time stream processing.

---

## **Key Considerations:**

1. **Security:** Implement the appropriate security measures such as **SSL/TLS encryption**, **SASL authentication**, or **IAM permissions**.
2. **Monitoring & Management:** Use native cloud monitoring solutions like **CloudWatch** (AWS), **Azure Monitor**, or **Stackdriver** (GCP) for real-time Kafka metrics.
3. **Integration with Cloud Services:**
   - On AWS: Integrate with **Lambda**, **Kinesis**, and **S3**.
   - On Azure: Integrate with **Azure Functions**, **Event Grid**, and **Blob Storage**.
   - On GCP: Integrate with **Dataflow**, **BigQuery**, and **Cloud Functions**.

### **Recommendation:**

For ease of use and managed services, consider using **Amazon MSK**, **Azure Event Hubs for Kafka**, or **Confluent Cloud**. If you need more control, deploying on VMs or compute instances in each cloud is an alternative.

## I choose Kafka because it is free. Otherwise I will use Confluent Cloud or built-in message solutions from AWS/Auzre/GCP. So basically to save my cost, I just use the vm in AWS/Auzre/GCP?

Yes, using Kafka on VMs in AWS, Azure, or GCP is a cost-effective approach if you want to leverage Kafka’s capabilities without the expenses of managed services like Confluent Cloud, Amazon MSK, or Azure Event Hubs. Setting up Kafka on VMs allows you to avoid licensing and subscription fees, giving you more control over the infrastructure. Here’s how you can optimize this setup for cost savings:

### **Why Deploy Kafka on VMs:**

1. **No Licensing Costs:** Kafka is an open-source tool, and deploying it on cloud VMs eliminates the need for licensing or subscription costs.
2. **Greater Control:** You have full control over the configurations, tuning, and scaling, which means you can optimize resource usage.
3. **Custom Deployments:** You can tailor the number of brokers, Zookeeper nodes, and configurations based on the workload and scale dynamically to minimize costs.

### **Cost-Saving Tips for VM-Based Kafka Deployments:**

1. **Choose the Right Instance Types:**
   - Select VM sizes that match your workload. For development and small-scale use, start with lower-cost instances (e.g., **t3.medium** in AWS or **B-series burstable VMs** in Azure).
   - For production, consider using **compute-optimized** or **storage-optimized** instances.

2. **Use Auto-Scaling and Spot Instances:**
   - Enable **auto-scaling** for brokers based on CPU and memory usage to optimize costs.
   - In AWS, use **Spot Instances** or **Reserved Instances** for cost savings.
   - In Azure, consider **Azure Spot VMs**, and in GCP, use **Preemptible VMs** for non-critical workloads.

3. **Leverage Storage Efficiently:**
   - Use **network-attached storage** (e.g., **EBS volumes in AWS**, **Managed Disks in Azure**, or **Persistent Disks in GCP**) for Kafka logs.
   - Configure **retention policies** carefully to avoid excessive storage costs.

4. **Optimize Networking Costs:**
   - Minimize data transfer costs by deploying Kafka and clients in the same region or availability zone.
   - For inter-region communication, consider setting up **VPC peering** or using **internal load balancers**.

5. **Monitor and Optimize:**
   - Use cloud monitoring tools (e.g., **AWS CloudWatch**, **Azure Monitor**, or **GCP Stackdriver**) to track resource usage and tune the setup.
   - Implement **auto-shutdown** policies for dev/test clusters during off-hours.

By carefully selecting VM types, optimizing resource allocation, and leveraging cloud-specific discounts, you can run Kafka on VMs cost-effectively across AWS, Azure, or GCP.
