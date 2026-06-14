package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Bone.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Bone", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getBone", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bone", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BoneKt {
    private static ImageVector _bone;

    public static final ImageVector getBone(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _bone;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Bone", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(225.09f, 102.44f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, -35.92f, 5.3f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -10.0f, 1.07f);
        pathBuilder.lineToRelative(-70.38f, 70.38f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -1.07f, 10.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, true, -51.42f, 10.51f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, true, 10.51f, -51.42f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 10.0f, -1.07f);
        pathBuilder.lineToRelative(70.38f, -70.38f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 1.07f, -10.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, true, 51.42f, -10.51f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, 25.41f, 46.12f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(231.67f, 60.89f);
        pathBuilder2.arcToRelative(35.82f, 35.82f, 0.0f, false, false, -23.82f, -12.74f);
        pathBuilder2.arcToRelative(36.0f, 36.0f, 0.0f, true, false, -66.37f, 22.92f);
        pathBuilder2.arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.0f, 0.08f);
        pathBuilder2.lineTo(71.17f, 141.51f);
        pathBuilder2.reflectiveCurveToRelative(0.0f, 0.0f, -0.1f, 0.0f);
        pathBuilder2.arcToRelative(36.0f, 36.0f, 0.0f, true, false, -22.92f, 66.37f);
        pathBuilder2.arcToRelative(36.0f, 36.0f, 0.0f, true, false, 66.37f, -22.92f);
        pathBuilder2.arcToRelative(0.54f, 0.54f, 0.0f, false, true, 0.0f, -0.08f);
        pathBuilder2.lineToRelative(70.35f, -70.36f);
        pathBuilder2.reflectiveCurveToRelative(0.0f, 0.0f, 0.1f, 0.0f);
        pathBuilder2.arcToRelative(36.0f, 36.0f, 0.0f, false, false, 46.74f, -53.63f);
        pathBuilder2.close();
        pathBuilder2.moveTo(219.1f, 97.16f);
        pathBuilder2.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -25.67f, 3.8f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -19.88f, 2.19f);
        pathBuilder2.lineToRelative(-70.4f, 70.4f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 101.0f, 193.43f);
        pathBuilder2.arcToRelative(20.0f, 20.0f, 0.0f, true, true, -36.75f, 7.5f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.91f, -9.24f);
        pathBuilder2.arcToRelative(8.5f, 8.5f, 0.0f, false, false, -1.23f, 0.1f);
        pathBuilder2.arcTo(20.0f, 20.0f, 0.0f, true, true, 62.57f, 155.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 19.88f, -2.19f);
        pathBuilder2.lineToRelative(70.4f, -70.4f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 155.0f, 62.57f);
        pathBuilder2.arcToRelative(20.0f, 20.0f, 0.0f, true, true, 36.75f, -7.5f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 9.14f, 9.14f);
        pathBuilder2.arcToRelative(20.0f, 20.0f, 0.0f, false, true, 18.17f, 33.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bone = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
