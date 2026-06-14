package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Tag.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Tag", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getTag", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_tag", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TagKt {
    private static ImageVector _tag;

    public static final ImageVector getTag(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _tag;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Tag", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(246.15f, 133.18f);
        pathBuilder.lineTo(146.83f, 33.86f);
        pathBuilder.arcTo(19.85f, 19.85f, 0.0f, false, false, 132.69f, 28.0f);
        pathBuilder.lineTo(40.0f, 28.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 40.0f);
        pathBuilder.verticalLineToRelative(92.69f);
        pathBuilder.arcToRelative(19.85f, 19.85f, 0.0f, false, false, 5.86f, 14.14f);
        pathBuilder.lineToRelative(99.32f, 99.32f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 28.28f, 0.0f);
        pathBuilder.lineToRelative(84.69f, -84.69f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 246.15f, 133.18f);
        pathBuilder.close();
        pathBuilder.moveTo(147.32f, 226.35f);
        pathBuilder.lineTo(52.0f, 131.0f);
        pathBuilder.lineTo(52.0f, 52.0f);
        pathBuilder.horizontalLineToRelative(79.0f);
        pathBuilder.lineToRelative(95.32f, 95.32f);
        pathBuilder.close();
        pathBuilder.moveTo(104.0f, 88.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, true, true, 88.0f, 72.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 104.0f, 88.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _tag = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
