package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1alpha3ResourceClaimTemplateSpecFluent<A extends V1alpha3ResourceClaimTemplateSpecFluent<A>> extends BaseFluent<A>{
  public V1alpha3ResourceClaimTemplateSpecFluent() {
  }
  
  public V1alpha3ResourceClaimTemplateSpecFluent(V1alpha3ResourceClaimTemplateSpec instance) {
    this.copyInstance(instance);
  }
  private V1ObjectMetaBuilder metadata;
  private V1alpha3ResourceClaimSpecBuilder spec;
  
  protected void copyInstance(V1alpha3ResourceClaimTemplateSpec instance) {
    instance = (instance != null ? instance : new V1alpha3ResourceClaimTemplateSpec());
    if (instance != null) {
          this.withMetadata(instance.getMetadata());
          this.withSpec(instance.getSpec());
        }
  }
  
  public V1ObjectMeta buildMetadata() {
    return this.metadata != null ? this.metadata.build() : null;
  }
  
  public A withMetadata(V1ObjectMeta metadata) {
    this._visitables.remove("metadata");
    if (metadata != null) {
        this.metadata = new V1ObjectMetaBuilder(metadata);
        this._visitables.get("metadata").add(this.metadata);
    } else {
        this.metadata = null;
        this._visitables.get("metadata").remove(this.metadata);
    }
    return (A) this;
  }
  
  public boolean hasMetadata() {
    return this.metadata != null;
  }
  
  public MetadataNested<A> withNewMetadata() {
    return new MetadataNested(null);
  }
  
  public MetadataNested<A> withNewMetadataLike(V1ObjectMeta item) {
    return new MetadataNested(item);
  }
  
  public MetadataNested<A> editMetadata() {
    return withNewMetadataLike(java.util.Optional.ofNullable(buildMetadata()).orElse(null));
  }
  
  public MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(java.util.Optional.ofNullable(buildMetadata()).orElse(new V1ObjectMetaBuilder().build()));
  }
  
  public MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item) {
    return withNewMetadataLike(java.util.Optional.ofNullable(buildMetadata()).orElse(item));
  }
  
  public V1alpha3ResourceClaimSpec buildSpec() {
    return this.spec != null ? this.spec.build() : null;
  }
  
  public A withSpec(V1alpha3ResourceClaimSpec spec) {
    this._visitables.remove("spec");
    if (spec != null) {
        this.spec = new V1alpha3ResourceClaimSpecBuilder(spec);
        this._visitables.get("spec").add(this.spec);
    } else {
        this.spec = null;
        this._visitables.get("spec").remove(this.spec);
    }
    return (A) this;
  }
  
  public boolean hasSpec() {
    return this.spec != null;
  }
  
  public SpecNested<A> withNewSpec() {
    return new SpecNested(null);
  }
  
  public SpecNested<A> withNewSpecLike(V1alpha3ResourceClaimSpec item) {
    return new SpecNested(item);
  }
  
  public SpecNested<A> editSpec() {
    return withNewSpecLike(java.util.Optional.ofNullable(buildSpec()).orElse(null));
  }
  
  public SpecNested<A> editOrNewSpec() {
    return withNewSpecLike(java.util.Optional.ofNullable(buildSpec()).orElse(new V1alpha3ResourceClaimSpecBuilder().build()));
  }
  
  public SpecNested<A> editOrNewSpecLike(V1alpha3ResourceClaimSpec item) {
    return withNewSpecLike(java.util.Optional.ofNullable(buildSpec()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha3ResourceClaimTemplateSpecFluent that = (V1alpha3ResourceClaimTemplateSpecFluent) o;
    if (!java.util.Objects.equals(metadata, that.metadata)) return false;
    if (!java.util.Objects.equals(spec, that.spec)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(metadata,  spec,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (metadata != null) { sb.append("metadata:"); sb.append(metadata + ","); }
    if (spec != null) { sb.append("spec:"); sb.append(spec); }
    sb.append("}");
    return sb.toString();
  }
  public class MetadataNested<N> extends V1ObjectMetaFluent<MetadataNested<N>> implements Nested<N>{
    MetadataNested(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
    V1ObjectMetaBuilder builder;
    
    public N and() {
      return (N) V1alpha3ResourceClaimTemplateSpecFluent.this.withMetadata(builder.build());
    }
    
    public N endMetadata() {
      return and();
    }
    
  
  }
  public class SpecNested<N> extends V1alpha3ResourceClaimSpecFluent<SpecNested<N>> implements Nested<N>{
    SpecNested(V1alpha3ResourceClaimSpec item) {
      this.builder = new V1alpha3ResourceClaimSpecBuilder(this, item);
    }
    V1alpha3ResourceClaimSpecBuilder builder;
    
    public N and() {
      return (N) V1alpha3ResourceClaimTemplateSpecFluent.this.withSpec(builder.build());
    }
    
    public N endSpec() {
      return and();
    }
    
  
  }

}